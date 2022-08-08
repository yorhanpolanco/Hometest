# README  

## Dependencies
- Java equal to or greater than version 1.8
- Maven 3.8.6
- Git version 2.37.1
- REST-Assured --> 4.5.0
- TestNG --> 7.5
- Fasterxml --> 2.13.2.1 

## Execution  

1. It is necessary to clone the API to the local machine " git clone https://github.com/swagger-api/swagger-petstore "   
2. To run the server " mvn package jetty:run "
3. The project was created maven so it has its pom file and it is necessary to download the dependencies:  
- Right click on the project --> Maven --> Update Project  
- Right click on the project --> Run As --> Install Maven  
4. Run the testng.xml file as TestNG Suite  

## Explain Approach  

To carry out this test, I started using the Karate framework that allows me to write the tests in BDD language with gherkin, use the scenario outline and generate the default report. After starting that process, I decided that in order to demonstrate greater domain of API automation and to be able to implement my own framework configuration, it would be more appropriate to use the aforementioned dependencies.
