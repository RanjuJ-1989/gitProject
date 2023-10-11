@SmokeTest
Feature: FaceBook Login

@TC001
Scenario: Login the Page
When User Clicks url "https://www.facebook.com/"
And User enter email address "ranjujayaputhiran89@gmail.com"
And User enter Password "pwd@1234"
Then User click login



