Feature: Login functionality

Background: User is successfully launched Application
When user opens "chrome" browser with exe as "D:\TESTING\chromedriver.exe"
When user open URL as "https://wwww.flipkart.com"
When user cancel login page

@SmokeTest
Scenario: Login functionality
When user moves on Login
When user click on My Pofile
When user enter "9421982116" as username
When user enter "scsmcoe" as password
When user click on Login
Then application shows user loged successfully 	