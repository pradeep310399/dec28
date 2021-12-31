Feature: Create the lead in leaftaps
Scenario: Test with positive credentials
#Given Open the chromebrowser
#And Load the url as 'http://leaftaps.com/opentaps' 
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click the login button
When Click the CRM/SFA link
When Click the leads tab link
When Click the createleads button link
And Enter the company name
And Enter the first name
And Enter the last name
When Click the create lead button
Then Created lead is displayed