#Feature: Leaftaps login functionality
#
#Scenario Outline: Test with positive credentials
#Given Open the chrome browser
#And Load the application url as <url>
#And Enter the username as <username>
#And Enter the password as <password>
#When Click login button
#Then Homepage should be displayed
#Examples: 
#|url|username|password|
#|'http://leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|
#|'http://leaftaps.com/opentaps'|'DemoCSR'|'crmsfa'|
#
#
#Scenario: Test with negative credentials
#Given Open the chrome browser
#And Load the application url as 'http://leaftaps.com/opentaps'
#And Enter the username as 'Demo'
#And Enter the password as 'crmsfa'
#When Click login button
#But Error should be displayed