Feature: Test Leaf test case

@WIP
Scenario Outline: 001_Login

Given Launch browser and load URL
And Enter UserName as <username>
And Enter PassWord as <password>
When Click login button
Then Click CRMSFA link
And Close browser

Examples:
|username|password|
|DemoCSR|crmsfa|

@Done
Scenario Outline: 002_CreatLead

Given Launch browser and load URL
And Enter UserName as DemoCSR
And Enter PassWord as crmsfa
When Click login button
Then Click CRMSFA link
And Click CreatLead link button
And Navigate to Creat Lead page
And Enter Company name as <companyname>
And Enter first name as <firstname>
And Enter last name as <lastname>
And Choose Cold call as Source 
And Enter Annual Revenue as int 2000
And Enter email address as tas@gmail.com
And Close browser

Examples: 
|companyname|firstname|lastname|
|ABC|Hema|Mali|
|XYZ|Hem|Ma|

@Done
Scenario: 003_Creat account 

Given Launch browser and load URL
And Enter UserName as DemoCSR
And Enter PassWord as crmsfa
When Click login button
Then Click CRMSFA link
And Click Create Account link button 
And Enter Account name as A
And Enter local name as N
And Choose Heath care as Industry
And Close browser

 
