JAXWS-try
=========

Creation of web service and client based on jax-ws



Publication Service (console)

Generating JAX-WS-artifacts

Portable JAX-WS-artifacts for Web-service order processing are generated using the program wsgen .
This program reads the Web SEI class and generates all the required artifacts for the deployment and activation of Web-service.

Program wsgen generates WSDL-file and XSD-schema for Web-service that you want to publish.

To generate JAX-WS-artifacts, you must first compile the source files bean-components and services:

1) Open a command prompt and navigate to the project src folder.


2) Run the following command to compile Java-files and place the class files into the appropriate folders:
javac com\dmytriy\jaxws\*.java com\dmytriy\jaxws\bean\*.java


3) Run the following command to generate a JAX-WS-artifacts: wsgen -cp . com.dmitriy.jaxws.OrderProcessService -wsdl

Wsgen program has many features, such as the generation of artifacts WSDL and schema for the service when you specify -wsdl .
After executing this command, you should see the files OrderProcess.wsdl and OrderProcess_schema1.xsd,
generated in the folder JAXWS-Tutorial, and JAX-WS-artifacts created in the folder com\dmitriy\jaxws\jaxws.


After generating artifacts Web-service order processing published by executing the following client application publisher:
4) Compile OrderWebServicePublisher , running the following command from the folder JAXWS-try:
javac com\dmitriy\jaxws\publish\OrderWebServicePublisher.java


5) Then run the command:  java com.dmitriy.jaxws.publish.OrderWebServicePublisher

After executing Java-program, you should see the following message:
The Web Service is published at http://localhost:8081/OrderProcessWeb/orderprocess
(Web-service is available at http://localhost:8081/OrderProcessWeb/orderprocess).
To stop running Web-service stop this Java-process.
Web-service order processing is published at http://localhost:8081/OrderProcessWeb/orderprocess


Check the work of Web-service you can by view WSDL:
6) Open your browser and go to http://localhost:8081/OrderProcessWeb/orderprocess?wsdl