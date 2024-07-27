#Aauthor : Salma DAGDOUG


Feature: OrangeHRM login page

Background: 
Given admin is on login page
Scenario: login with valid credentials
When admin enter correct user name "Admin" and correct passeword "admin123"
Then admin is directed to the home page that contains message "Dashboard"


Scenario: login with invalid credentials
When admin enter incorrect user name "Adminnnn" and correct passeword "admin123"
Then admin  rest dans la meme page that contains message "Invalid credentials"