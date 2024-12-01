# Question 1

# POS Malaysia APITesting Project Using Postman

Building a Postman Collection to test the API's for the POS Malaysia url https://www.pos.com.my/send/ratecalculator 
Calculating the Shiping Rates By Selecting Countries and Entering the PostCodes.
Based on given inputs it will caluclate and give you the quotes.


## Getting Started
Created API Collection with the name of APITestingAssessment.
Under APITestingAssessment Collection created Multiple API Tests as below.


## API Tests
 1. GET - GetListOfCountriesInToDropdown 
 2. POST - PostCodeFrom
 3. POST - PostCodeTo
 4. POST - CalculateQuote


## Description
 1. GET - GetListOfCountriesInToDropdown - It is a Country "To"   
 dropdownlist. 
 2. It will retrive all the available Countries and Country 
 codes from the API.
 3. POST - PostCodeFrom - It will post and give the response of 
 the "From" PostCode and auto populate the the country and state 
 details.
 4. POST - PostCodeTo - It will post and give the response of  
 the "To" PostCode and auto populate the the country and state 
 details.
 5. POST - CalculateQuote - It will caluclate and give the multipe 
 quotes with prices to book based on the countries and states  
 selected.


## Execution
Go to APITestingAssessment Collection we can run individual Tests 
and also run the whole Collection from the collection profile.
It will show the status of the Tests Pass or Fail.






# Question 2

# POS Malaysia TestAutomation Project using Selenium Java

Created a Maven Project using selenium, java, TestNG to Test the caluclation of shipping charges and to get multiple quotes.By Entering Details "From" and "To" Countries and States in as given url https://www.pos.com.my/send/ratecalculator


##Test Description and Execution
Created Tests "CaluclateRate" and "VerifyQuotes" to caluclate prices and get multiple quotes.
When it starts Execution 
 1. It will launch the Chrome Browser and navigate to url https:// 
 www.pos.com.my/send/ratecalculator 
 2. It will Enters the "From" PostCode as "35600" then based on  
 PostCode State will Auto populate "Perak".
 3. Then it will Selects the "To" dropdownlist as "India" and  
 Enters the Weight as "5" kgs then clicks on Caluclate button.
 3. Based on the inputs Multiple quotes and prices will retrive.
 4. Then verify the quotes and prices with assertions.


##Prerequisites
This Project requires the following softwares to run
 Java 23.0.1 or above should be installed in machine
 Chrome Browser or any other Browser supported by selenium
 Eclipse version=4.32.0


##Steps
 1. In Eclipse and Created a New Maven Project with name   
 "TestAutomation".
 2. Under src/test/java - created a package name as "com.Tests".
 3. Under com.Tests - created a java class file name as  
 "caluculateRate.java".
 4. In caluculateRate.java written all Tests using selenium and  
 TestNG.
 5. Created TestNG Suit name as "calculateShippingRateSuite.xml"
 under project level.


##Maven Dependencies
 Added Maven Dependences in "pom.xml" file
 1. selenium Webdriver version 4.27.0
 2. TestNG version 7.10.2
 3.  Webdrivermanager version 5.9.2


##To Run this Project or from class file
 1. Goto src/test/java > com.Tests > caluculateRate.java
 we can run individual tests but here tests created under TestNG   
 suggested to run Run all executes one by one - click on Run All 
 just before class name or click on Play button and also press   
 shortcut Ctrl + F11.
 2. Second way to run When you are in "caluculateRate.java" file  
 right click on mouse and select Run As > TestNG Test.


##To Run this From TestNG calculateShippingRateSuite.xml suite
 1. Goto "calculateShippingRateSuite.xml" Under project level 
 click on Play button or shortcut Ctrl + F11.
 2. In Package explorer select "calculateShippingRateSuite.xml" 
 right click and Run As TestNG suite.


##Note
Run All Tests in Sequential order.