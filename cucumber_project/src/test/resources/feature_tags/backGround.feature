Feature:  login to HRML application

Background:
Given  User is on HRMLogin page "https://opensource-demo.orange"

@ValidCredentials 

Scenario: login with valid credentials

When  user enters username as "Admin" and password as "admin123"
Then user should be able to login successfully and new page opens

@Missingusername
Scenario:

When user enters username as "admin123"
Then user should be able to see a message "Required" below username