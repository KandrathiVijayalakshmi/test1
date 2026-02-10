Feature: Test login functionality

Scenario Outline: check login is succesfull with user credentials
 
Given browser is on open
And users on login page
When enters<username> and <password>
Then click on login button

Examples:

|username|password|
|standard_user|secret_sauce|