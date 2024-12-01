
# POS Malaysia APITesting Project Using Postman

Building a Postman Collection to test the API's for the POS Malaysia url https://www.pos.com.my/send/ratecalculator 
Calculating the Shiping Rates By Selecting Countries and Entering the PostCodes.
Based on given inputs it will caluclate and give you the quotes.


##Getting Started
Created API Collection with the name of APITestingAssessment.
Under APITestingAssessment Collection created Multiple API Tests as below.


##API Tests
 1. GET - GetListOfCountriesInToDropdown 
 2. POST - PostCodeFrom
 3. POST - PostCodeTo
 4. POST - CalculateQuote


##Description
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


##Execution
Go to APITestingAssessment Collection we can run individual Tests 
and also run the whole Collection from the collection profile.
It will show the status of the Tests Pass or Fail.