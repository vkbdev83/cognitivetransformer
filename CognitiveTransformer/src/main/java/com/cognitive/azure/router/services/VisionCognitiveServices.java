package com.cognitive.azure.router.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learnazure.model.ImageCognitive;
import com.microsoft.azure.cognitiveservices.vision.computervision.ComputerVisionClient;
import com.microsoft.azure.cognitiveservices.vision.computervision.ComputerVisionManager;
import com.microsoft.azure.cognitiveservices.vision.computervision.models.Category;
import com.microsoft.azure.cognitiveservices.vision.computervision.models.ImageAnalysis;
import com.microsoft.azure.cognitiveservices.vision.computervision.models.ImageTag;
import com.microsoft.azure.cognitiveservices.vision.computervision.models.OcrLanguages;
import com.microsoft.azure.cognitiveservices.vision.computervision.models.OcrLine;
import com.microsoft.azure.cognitiveservices.vision.computervision.models.OcrRegion;
import com.microsoft.azure.cognitiveservices.vision.computervision.models.OcrResult;
import com.microsoft.azure.cognitiveservices.vision.computervision.models.OcrWord;
import com.microsoft.azure.cognitiveservices.vision.computervision.models.VisualFeatureTypes;

@Service
public class VisionCognitiveServices {

	public static String subscriptionKey = "94efb81af6574e4ca971a1a35ab1ca99";
	public static String endpoint = "https://southeastasia.api.cognitive.microsoft.com/";
	
	
	
	public ImageCognitive getImageInsights(String filePath) {
		
		ComputerVisionClient compVisClient = ComputerVisionManager.authenticate(subscriptionKey).withEndpoint(endpoint);
		// END - Create an authenticated Computer Vision client.

		System.out.println("\nAzure Cognitive Services Computer Vision - Java Quickstart Sample");

		
		// Need a byte array for analyzing a local image.
		File rawImage = new File(filePath);
		
		byte[] imageByteArray;
		
		try {
			imageByteArray = Files.readAllBytes(rawImage.toPath());
		

			// Analyze local and remote images
			return analyzeLocalImage(compVisClient,imageByteArray);

			// Recognize printed text with OCR for a local and remote (URL) image
			//recognizeTextOCRLocal(compVisClient,imageByteArray);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;

	}



	

	private ImageCognitive analyzeLocalImage(ComputerVisionClient compVisClient,byte[] imageByteArray) {
		// Call the Computer Vision service and tell it to analyze the loaded image.
				ImageAnalysis analysis = compVisClient.computerVision().analyzeImageInStream().withImage(imageByteArray)
				        .withVisualFeatures(getFeature()).execute();
				
				ImageCognitive cognitive = new ImageCognitive();
			
				List<String> categories = new ArrayList<>();
				List<String> tags = new ArrayList<>();
			
				
				// Display image captions and confidence values.
				System.out.println("\nCaptions: ");
//				for (ImageCaption caption : analysis.description().captions()) {
//					
//					captions.add(caption.text());
//				    //System.out.printf("\'%s\' with confidence %f\n", caption.text(), caption.confidence());
//				}
				
				// Display image category names and confidence values.
				System.out.println("\nCategories: ");
				for (Category category : analysis.categories()) {
					categories.add(category.name());
				}
				
				System.out.println("categories: " + categories);
				for (ImageTag tag : analysis.tags()) {
					tags.add(tag.name());
				    //System.out.printf("\'%s\' with confidence %f\n", tag.name(), tag.confidence());
				}
				cognitive.setImageCategories(categories);
				cognitive.setImageTags(tags);
				System.out.println("tags: " + tags);
				return cognitive;
	}

	public List<VisualFeatureTypes> getFeature() {

		List<VisualFeatureTypes> featuresToExtractFromLocalImage = new ArrayList<>();
		featuresToExtractFromLocalImage.add(VisualFeatureTypes.DESCRIPTION);
		featuresToExtractFromLocalImage.add(VisualFeatureTypes.CATEGORIES);
		featuresToExtractFromLocalImage.add(VisualFeatureTypes.TAGS);
		featuresToExtractFromLocalImage.add(VisualFeatureTypes.FACES);
		featuresToExtractFromLocalImage.add(VisualFeatureTypes.ADULT);
		featuresToExtractFromLocalImage.add(VisualFeatureTypes.COLOR);
		featuresToExtractFromLocalImage.add(VisualFeatureTypes.IMAGE_TYPE);
		return featuresToExtractFromLocalImage;
	}
	
private void recognizeTextOCRLocal(ComputerVisionClient compVisClient,byte[] imageByteArray) {
		
		OcrResult ocrResultLocal = compVisClient.computerVision().recognizePrintedTextInStream()
                .withDetectOrientation(true).withImage(imageByteArray).withLanguage(OcrLanguages.EN).execute();
		
		System.out.println();
		System.out.println("Recognizing printed text from a local image with OCR ...");
		System.out.println("\nLanguage: " + ocrResultLocal.language());
		System.out.printf("Text angle: %1.3f\n", ocrResultLocal.textAngle());
		System.out.println("Orientation: " + ocrResultLocal.orientation());

		boolean firstWord = true;
		// Gets entire region of text block
		for (OcrRegion reg : ocrResultLocal.regions()) {
		    // Get one line in the text block
		    for (OcrLine line : reg.lines()) {
		        for (OcrWord word : line.words()) {
		            // get bounding box of first word recognized (just to demo)
		            if (firstWord) {
		                System.out.println("\nFirst word in first line is \"" + word.text()
		                        + "\" with  bounding box: " + word.boundingBox());
		                firstWord = false;
		                System.out.println();
		            }
		            System.out.print(word.text() + " ");
		        }
		        System.out.println();
		    }
		}
		
	}

}
