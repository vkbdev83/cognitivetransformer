# cognitivetransformer

Application leverages the Azure cognitive services to unlock the insights in the documents, images & video and save it to the Azure Blob storage. App reads the content info from the queues and process sequentially.

To setup the Application , below properties should be updated under src/resource/application.properties

#Temp directory to copy files
app.file-copy-directory=/tmp/

#Add the formates to be supported by this App

app.image-file-formats=jpeg,jpg,bmp,png
app.doc-file-formats=pdf,doc,txt
app.video-file-formats=avi,mov
server.port=80

#Source File Containers
azure.storage-container-name=<Source Storage Container name>
azure.storage-connection-string=<Source Storage Connection String>

#Index File Container
azure.index-storage-container-name=<Insight Storage container name>
azure.index-storage-connection-string=<Insight Storage connection string >

#Azure Service Bus queue configuration
spring.jms.servicebus.connection-string=<service bus Queue connection string>
spring.jms.servicebus.idle-timeout=1800000
azure.servicebus.queue-name=<service bus Queue Name>

#azure VideoIndexer(VI) Configuration
azure.video-indexer-account=<VI Account ID>
azure.video-indexer-region=<VI region>
azure.video-indexer-api-url=https://api.videoindexer.ai/
azure.video-indexer-subscription-id=<VI subscription ID>

This application is packaged as Docker Image using Jib plugin, below properties should be updated in pom.xml 
#Docker Repo Url
<docker.image.prefix></docker.image.prefix>
<username></username>
<password></password>

The Application can be build and pushed to DOCKER REPO
command > mvn compile jib:build
