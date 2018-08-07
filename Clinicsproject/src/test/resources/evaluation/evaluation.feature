Feature: Test the patient record in evaluation room

@evapatient
Scenario Outline: Test the patient worklist and collect information in evaluation

Given select the browser for evaluation as <Browser>
When Give the url for clinics automation as <Url>
And enter the username for evaluation as <User>
But enter the password for evaluation as <Password>
And select the radio for evaluation
Then click to the login for evaluation
And click to worklist column link
But click the searchlink button
When enter the patientid in evaluation worklist as <Patiid>
And select the evaluation Appoinment from date as <appfromdate>
But select the evaluation Appoinment to date as <apptodate>
Then click the search button
When just select the Add case sheet for selected patient
But Validate the patientid, Age, Sex, Contactno and Priviledgeno as <Age>, <Sex>, <Contactno>, <Priviledgeno> in casesheet for evaluation
And click general info and enter the Chief compliants as <Chiefcomp>
When Enter the Presenting complaint as <Presentcomp> in geninfo
But Enter the History presenting complaint as <Hisprescomp> in geninfo
Then Enter the Previous ocular history Injury as <Preocuhis> in geninfo
Given Enter the Systemic Illness/History as <Sysilln> in geninfo
When Enter the Clinical history as <Clinhis> in geninfo
And Enter the Treatment history as <Treathis> in geninfo
Then Enter the Family history as <Famihis> in geninfo
But Enter the Allergies as <Allerg> in geninfo
And whether check the patientid same or not then only click to Visual Acuity
Then Select the visual acuity as unit type as <VAUnit>
But select the value of Right eye Un-Aided Dist as <RUAD>
And Select the Right eye Un-Aided Near as <RUAN>
When Select the Left eye Un-Aided Dist as <LUAD>
And Select the Left eye Un-Aided Near as <LUAN>
Given select the Right eye Aided Dist as <RAD>
But Select the Right eye Aided Near as <RAN>
When Select the Left eye Aided Dist as <LAD>
Then Select the Left eye Aided Near as <LAN>
And Select the Right eye Pinhole as <Rpinhole>
But Select the Left eye Pinhole as <Lpinhole>
And click to subjective acceptance link
When select the subjective acceptance of Right eyeDV Sphere as <RightDVSPH>
And select the subjective acceptance value of Right eyeDV Cylinder as <RightDVCYL>
But select the subjective acceptance value of Right eyeDV Axis as <RightDVAxis>
Then select the subjective acceptance value of Right eyeDV Visual Acuity as <RightDVVA>
When select the subjective acceptance value of Left eyeDV Sphere as <LeftDVSPH>
And select the subjective acceptance value of Left eyeDV Cylinder as <LeftDVCYL>
But select the subjective acceptance value of Left eyeDV Axis as <LeftDVAxis>
Then select the subjective acceptance value of Left eyeDV Visual Acuity as <LeftDVVA>
When select the subjective acceptance value of Right eyeNV Sphere as <RightNVSPH>
And validate the subjective acceptance value of Right eyeNV Cylinder
But validate the subjective acceptance value of Right eyeNV Axis
Then select the subjective acceptance value of Right eyeNV Visual Acuity as <RightNVVA>
When select the subjective acceptance value of Left eyeNV Sphere as <LeftNVSPH>
And validate the subjective acceptance value of Left eyeNV Cylinder
But validate the subjective acceptance value of Left eyeNV Axis
But select the subjective acceptance value of Left eyeNV Visual Acuity as <LeftNVVA>
And click to intracular pressure link
When Select the value of Right eye Schiotz max as <RSMAX>
But Select the value of Right eye Schiotz min as <RSMIN>
Then enter Right eye Schiotz remarks as <RSR>
And Select the value of Left eye Schiotz max as <LSMAX>
But Select the value of Left eye Schiotz min as <LSMIN>
Then enter Left eye Schiotz remarks as <LSR>
When Select the value of Right eye Applanation max as <RAMAX>
But Select the value of Right eye Applanation min as <RAMIN>
Then enter Right eye Applanation remarks as <RAR>
And Select the value of Left eye Applanation max as <LAMAX>
But Select the value of Left eye Applanation min as <LAMIN>
Then enter Left eye Applanation remarks as <LAR>
When Select the value of Right eye Non-Contact max as <RNCMAX>
But Select the value of Right eye Non-Contact min as <RNCMIN>
Then enter Right eye Non-Contact remarks as <RNCR>
And Select the value of Left eye Non-Contact max as <LNCMAX>
But Select the value of Left eye Non-Contact min as <LNCMIN>
Then enter Left eye Non-Contact remarks as <LNCR>
Then save the button
Then click to assign the next room


Examples:
|Browser|Url|User|Password|Patiid|appfromdate|apptodate|Age|Sex|Contactno|Privilegeno|Chiefcomp|Presentcomp|Hisprescomp|Preocuhis|Sysilln|Clinhis|Treathis|Famihis|Allerg|VAUnit|RUAD|RUAN|LUAD|LUAN|RAD|RAN|LAD|LAN|Rpinhole|Lpinhole|RightDVSPH|RightDVCYL|RightDVAxis|RightDVVA|LeftDVSPH|LeftDVCYL|LeftDVAxis|LeftDVVA|RightNVSPH|RightNVVA|LeftNVSPH|LeftNVVA|RSMAX|RSMIN|RSR|LSMAX|LSMIN|LSR|RAMAX|RAMIN|RAR|LAMAX|LAMIN|LAR|RNCMAX|RNCMIN|RNCR|LNCMAX|LNCMIN|LNCR|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@eva.in|password|pellu061|2-Aug-2018|2-Aug-2018|28 Years|Female|7845488305|sdkhkjdf015|None|Yes|None|Yes|None|Yes|None|Yes|None|Log MAR|NoPL|N36|NoPL|N36|NoPL|N36|NoPL|N36|No PL|No PL|+20.00|+6.00|180|No PL|+20.00|+6.00|180|No PL|+20.00|N36|+20.00|N36|60|.0|None|60|.0|None|50|.0|None|60|.0|None|60|.0|None|60|.0|None|

