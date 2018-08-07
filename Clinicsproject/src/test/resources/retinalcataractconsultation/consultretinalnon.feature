Feature: Test the consultation room for noncatract

@retinalnoncat
Scenario Outline: Test the retinal non catract workflow

Given select the browser for retinalnoncat as <Browser>
And enter the url for retinalnoncat as <Url>
When enter the username for retinalnoncat as <User>
But enter the password for retinalnoncat as <Pass>
Then click the login for retinalnoncat
Given click the retinal worklist coloumn
And click the search filter for find patientid
When give the patient id as <Patid> for retinal
And select the application from date as <appfrom> for retinalnoncat
But select the application to date as <appto> for retinalnoncat
Then click to search for retinalnoncat
When click to patientname to corresponding patientid for retinalnoncat
Then validate the patientid, age as <Age>, sex as <Sex>, contactno as <Contactno>, procedure as <Procedure> and then click case sheet tab for retinalnoncat
When validate the general Chief compliants as <Chiefcomp> for retinalnoncat
Given validate the general Presenting complaint as <Presentcomp> for retinalnoncat
When validate the general History presenting complaint as <Hisprescomp> for retinalnoncat
And validate the general Previous ocular history as <Preocuhis> for retinalnoncat
Then validate the general Systemic Illness/History as <Sysilln> for retinalnoncat
But validate the general Clinical history as <Clinhis> for retinalnoncat
And validate the general Treatment history as <Treathis> for retinalnoncat
But validate the general Family history as <Famihis> for retinalnoncat
Then validate the general Allergies as <Allerg> for retinalnoncat
And validate the VA Right eye Un-Aided Distance for retinalnoncat as <RUADR>
But validate the VA Right eye Un-Aided Near for retinalnoncat as <RUANR>
When validate the VA Left eye Un-Aided Distance for retinalnoncat as <LUADR>
Given validate the VA Left eye Un-Aided Near for retinalnoncat as <LUANR>
Then validate the VA Right eye Aided Dist as <RAD> for retinalnoncat
But validate the VA Right eye Aided Near as <RAN> for retinalnoncat
When validate the VA Left eye Aided Dist as <LAD> for retinalnoncat
And validate the VA Left eye Aided Near as <LAN> for retinalnoncat
But validate the VA Right eye Pinhole as <Rpinhole> for retinalnoncat
Then validate the VA Left eye Pinhole as <Lpinhole> for retinalnoncat
When validate the subjective acceptance of Right eyeDV Sphere as <RightDVSPH> for retinalnoncat
And validate the subjective acceptance value of Right eyeDV Cylinder as <RightDVCYL> for retinalnoncat
But validate the subjective acceptance value of Right eyeDV Axis as <RightDVAxis> for retinalnoncat
Then validate the subjective acceptance value of Right eyeDV Visual Acuity as <RightDVVA> for retinalnoncat
When validate the subjective acceptance value of Left eyeDV Sphere as <LeftDVSPH> for retinalnoncat
And validate the subjective acceptance value of Left eyeDV Cylinder as <LeftDVCYL> for retinalnoncat
But validate the subjective acceptance value of Left eyeDV Axis as <LeftDVAxis> for retinalnoncat
Then validate the subjective acceptance value of Left eyeDV Visual Acuity as <LeftDVVA> for retinalnoncat
When validate the subjective acceptance value of Right eyeNV Sphere as <RightNVSPH> for retinalnoncat
And validate the subjective acceptance value of Right eyeNV Cylinder for retinalnoncat
But validate the subjective acceptance value of Right eyeNV Axis for retinalnoncat
Then validate the subjective acceptance value of Right eyeNV Visual Acuity as <RightNVVA> for retinalnoncat
When validate the subjective acceptance value of Left eyeNV Sphere as <LeftNVSPH> for retinalnoncat
And validate the subjective acceptance value of Left eyeNV Cylinder for retinalnoncat
But validate the subjective acceptance value of Left eyeNV Axis for retinalnoncat
And validate the subjective acceptance value of Left eyeNV Visual Acuity as <LeftNVVA> for retinalnoncat
When validate the value of Right eye Schiotz max, min as <RSMAX>, <RSMIN> for retinalnoncat
And validate the value of Left eye Schiotz max, min as <LSMAX>, <LSMIN> for retinalnoncat
When validate the value of Right eye Applanation max, min as <RAMAX>, <RAMIN> for retinalnoncat
And validate the value of Left eye Applanation max, min as <LAMAX>, <LAMIN> for retinalnoncat
When validate the value of Right eye Non-Contact max, min as <RNCMAX>, <RNCMIN> for retinalnoncat
And validate the value of Left eye Non-Contact max, min as <LNCMAX>, <LNCMIN> for retinalnoncat
But Check the right eye Diagnosis values as <Righteyediagnosis> for retinalconsult
And Check the left eye Diagnosis values as <Lefteyediagnosis> for retinalconsult
When Give the Advice feature in report as <Advice> for retinalconsult
When Whether do you select report title or diagnosis as <titlediagnosis>, then report title or diagnosis values are as <reporttemp> for retinalconsult
Then click to others button
When Would you like to refer the room as <other>
And if refer to room is department, then select the department as <retirefer>
But if refer to room is Investigation, then select the scans as <firstinv>, <secondinv>, <thirdinv>, <fourthinv>
Then if refer to room is Lab, then select the scans as <firstlab>, <secondlab>, <thirdlab>, <fourthlab>
When if refer to room is special procedure, then select procedure as <procedure>
Then Click to the next room for retinalnoncat

Examples:
|Browser|Url|User|Pass|Patid|appfrom|appto|Age|Sex|Contactno|Procedure|Chiefcomp|Presentcomp|Hisprescomp|Preocuhis|Sysilln|Clinhis|Treathis|Famihis|Allerg|RUADR|RUANR|LUADR|LUANR|RAD|RAN|LAD|LAN|Rpinhole|Lpinhole|RightDVSPH|RightDVCYL|RightDVAxis|RightDVVA|LeftDVSPH|LeftDVCYL|LeftDVAxis|LeftDVVA|RightNVSPH|RightNVVA|LeftNVSPH|LeftNVVA|RSMAX|RSMIN|LSMAX|LSMIN|RAMAX|RAMIN|LAMAX|LAMIN|RNCMAX|RNCMIN|LNCMAX|LNCMIN|Righteyediagnosis|Lefteyediagnosis|Advice|titlediagnosis|reporttemp|other|retirefer|firstinv|secondinv|thirdinv|fourthinv|firstlab|secondlab|thirdlab|fourthlab|procedure|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@con.in|password|pellu071|1-Aug-2018|1-Aug-2018|25 Years|Female|7845488305|eyecare|None|Yes|None|Yes|None|Yes|None|Yes|None|0.00|N1|0.00|N1|0.00|N1|0.00|N1|0.00|0.00|-0.25|-0.25|1|6/6|-0.25|-0.25|1|6/6|-0.25|N12|-0.25|N12|1|.9|1|.9|1|.9|1|.9|1|.9|1|.9|Blepharitis,Trichiasis,Ptrygium|Blepharitis,Trichiasis,Ptrygium|Others|Title|eye near|Refer to department|Glaucoma||||||||||
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@con.in|password|pellu072|1-Aug-2018|1-Aug-2018|26 Years|Female|7845488305|eye damage|None|Yes|None|Yes|None|Yes|None|Yes|None|+1.20|N5|+1.20|N5|+1.20|N5|+1.20|N5|+1.20|+1.20|-20.00|-6.00|15|5/60p|-20.00|-6.00|15|5/60p|-20.00|N18|-20.00|N18|20|.5|20|.5|20|.5|20|.5|20|.5|20|.5|Entropion,Trichiasis,Conjunctivitis-Allergic|Corneal ulcer-Bacterial|Others|Diagnosis|Nothing|Investigation room||OCT|Fundus|Bscan|Ascan||||||
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@con.in|password|pellu073|1-Aug-2018|1-Aug-2018|27 Years|Male|7845488305|eyecare|None|Yes|None|Yes|None|Yes|None|Yes|None|>+3.0|N24|>+3.0|N24|>+3.0|N24|>+3.0|N24|No improvement|No improvement|Plano|+0.25|99|1/60p|Plano|+0.25|99|1/60p|Plano|N24|Plano|N24|40|.3|40|.3|40|.3|40|.3|40|.3|40|.3|Conjunctivitis-Bacterial|Conjunctivitis-Viral|Others|Title|eye normal|Lab settings||||||Haemoglobin|TC|DC|RBC Count||
