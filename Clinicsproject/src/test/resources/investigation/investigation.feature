Feature: Test the investigation room

@invest
Scenario Outline: End to end test for investigation

Given select the browser as <Browser>
When give the url as <Url>
And enter the username as <User>
But enter the password as <Pass>
Then click to login button
When click to worklist column
And click to search filter link
But enter the patientid as <Patientid> for investigation
Then give the appfromdate as <Appfrom> in investigation room
And give the apptodate as <Appto> in investigation room
Then click to search button for investigation
And click image upload icon for respective patient
But select the Machine type as <Machine>
And upload Left eye images for investigation
When upload Right eye images for investigation
Then upload other image for investigation
But upload report for investigation
Then click to upload button

Examples:
|Browser|Url|User|Pass|Patientid|Appfrom|Appto|Machine|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@inv.in|password|pellu072|27-Jul-2018|27-Jul-2018|BScan|








