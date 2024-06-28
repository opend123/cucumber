Feature: To validity the login fuctionality of facebook


Scenario: To validate the login with valid username and invalid password


Given To launch the browser and maximize the window

When To launch the url of the facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To  check whether navigate to the password field

Then To close the browser

Scenario Outline: To validate the positive and negative combination of logic functionality
Given User has to launch the browser and maximize the window
When User has to hit the facebook url.
And User has to pass to pass the data "<emaildatas>" in email field
And User has to pass to pass the data "<passworddatas>" in password field
And User has to click the login button
Then User has to close the browser

Examples:
 |emaildatas              |passworddatas|
 |praveenkk171@gmail.com  |123455       |
 |defebf12@gmail.com      |56778        |
 |tyui@gamil.com          |567890       |
 |tyuiok@gamil.com        |345678       |
 |wertyuii@gamil.com      |123455       |

