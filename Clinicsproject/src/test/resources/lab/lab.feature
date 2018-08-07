Feature: Test the lab room in clinics

@lab
Scenario Outline: Test the lab room for end to end testing

Given select the browser as <Browser>
And enter the url as <Url>
Then give the user name as <User>
But give the password as <Pass>
Then click to login button
And click to worklist column for lab
But click to search filter link
When enter the patientid as <Patientid> for lab search
Then enter the app from date as <Appfrom>
When enter the app to date as <Appto>
Then Click to search button
And Click to add lab report in respective patient
But enter the Haemoglobin value as <Haemoglobin>
And enter the TC value as <TC>
When enter the DC value as <DC>
But enter the RBC count as <RBC>
Then Whether would like to click direct to doctor or save the patient as <Directsave>, then assign

Examples:
|Browser|Url|User|Pass|Patientid|Appfrom|Appto|Haemoglobin|TC|DC|RBC|Directsave|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@lab.in|password|pellu072|12-Jul-2018|12-Jul-2018|13.5|5000|50|5|save|






 
