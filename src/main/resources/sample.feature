Feature: To validity the login fuctionality of facebook


Scenario: To validate the login with valid username and invalid password


Given To launch the browser and maximize the window

When To launch the url of the facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To  check whether navigate to the password field
Then To close the browser