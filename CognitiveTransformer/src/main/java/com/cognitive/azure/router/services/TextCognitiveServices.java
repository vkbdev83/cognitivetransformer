package com.cognitive.azure.router.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.ai.textanalytics.models.CategorizedEntity;
import com.azure.core.credential.AzureKeyCredential;
import com.cognitive.azure.router.utils.AppProperties;
import com.cognitive.azure.router.utils.AzureProperties;
import com.learnazure.model.TextCognitive;
import com.learnazure.model.TextEntity;


@Service
public class TextCognitiveServices {
	
	@Autowired
	private AzureProperties azureProperties;
	
	@Autowired
	private AppProperties appProperties;

	private static String KEY = "94efb81af6574e4ca971a1a35ab1ca99";
	private static String ENDPOINT = "https://southeastasia.api.cognitive.microsoft.com/";

	public TextCognitive performTextAnalytics(String text) {

		TextAnalyticsClient client = authenticateClient(KEY, ENDPOINT);

		return recognizeEntitiesExample(client,text);

		//extractKeyPhrasesExample(client);
	}

	private TextAnalyticsClient authenticateClient(String key, String endpoint) {

		return new TextAnalyticsClientBuilder().apiKey(new AzureKeyCredential(key)).endpoint(endpoint).buildClient();
	}

	private TextCognitive recognizeEntitiesExample(TextAnalyticsClient client,String text) {
		// The text that need be analyzed.
		//String text = "I had a wonderful trip to Seattle last week.";
		
		TextCognitive cog = new TextCognitive();
		
		List<TextEntity> entityList = new ArrayList<>();

		for (CategorizedEntity entity : client.recognizeEntities(text)) {
			
			TextEntity entityObj = new TextEntity();
			
			entityObj.setCategory(entity.getCategory().toString());
			
			entityObj.setSubCategory(entity.getSubCategory());
			
			entityObj.setText(entity.getText());
			entityList.add(entityObj);
			System.out.printf("Recognized entity: %s, entity category: %s, entity sub-category: %s, score: %s.%n",
					entity.getText(), entity.getCategory(), entity.getSubCategory(), entity.getConfidenceScore());
		}
		
		List<String> keyPhrases = new ArrayList<>();
		
		for (String keyPhrase : client.extractKeyPhrases(text)) {
			keyPhrases.add(keyPhrase);
		}
		
		cog.setTextEntity(entityList);
		cog.setKeyPhrases(keyPhrases);
		return cog;
		
	}

//	private void extractKeyPhrasesExample(TextAnalyticsClient client) {
//		// The text that need be analyzed.
//		String text = "My cat might need to see a veterinarian.";
//
//		System.out.printf("Recognized phrases: %n");
//		for (String keyPhrase : client.extractKeyPhrases(text)) {
//			System.out.printf("%s%n", keyPhrase);
//		}
//	}
	
	

	
}
