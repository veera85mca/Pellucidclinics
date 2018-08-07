Feature: Test the Clinics homepage

@home
Scenario Outline: Test the Clinics login homepage

Given select the browser as <Browser>
When enter the url as <Url>
And enter the username as <Username>
But enter the password as <Password>
And check the radio button
Then click to login button
When Click to logout

Examples:
|Browser|Url|Username|Password|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|