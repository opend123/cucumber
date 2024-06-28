Feature: To validity the login fuctionality of amazon


Scenario: To validate the login with valid username and valid password


Given To launch the browser and maximize the window

When To launch the url of the amazon application
And To pass valid username in email field
And To pass valid password in password field
And To click the sign in  button
And To  check whether navigate to the  next page

Then To close the window