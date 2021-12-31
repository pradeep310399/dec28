Feature: Edit the lead of leaftaps
Scenario: Test with positive credentials
#Given Open the chromebrowser
#And Load the url as 'http://leaftaps.com/opentaps' 
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click the login button
When Click the CRM/SFA link
When Click the leads tab link
When click the find leads link
When Click the phone tab link
Given Enter the phone number
When Click the find leads button
When Click the first link
When Click the edit buttton link
Given Enter edit company name
When Click the update button
Then VErify the update page
