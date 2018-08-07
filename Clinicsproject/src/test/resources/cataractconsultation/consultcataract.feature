Feature: Test the consultation room

@consultcataract
Scenario Outline: Test the consultation for patient workflow

Given select the browser for catconsult as <Browser>
When give the url link for catconsult as <URL>
And enter the username for catconsult as <User>
But enter the password for catconsult as <Pass>
Then click the login button for catconsult
When click the worklist coloumn for catconsult
Then click the search filter link for catconsult
When give the patient id as <Patientid> for search in catconsult
And select the application from date as <Appfrom> for catconsult
But select the application to date as <Appto> for catconsult
Then click to search button for catconsult
When want to click the patient name respective of patient id for catconsult
And validate the patientid, age as <Age>, sex as <Sex>, contactno as <Contactno>, procedure as <Procedure> and then click case sheet tab for catconsult
When validate the general Chief compliants as <Chiefcomp> for catconsult
Given validate the general Presenting complaint as <Presentcomp> for catconsult
When validate the general History presenting complaint as <Hisprescomp> for catconsult
And validate the general Previous ocular history as <Preocuhis> for catconsult
Then validate the general Systemic Illness/History as <Sysilln> for catconsult
But validate the general Clinical history as <Clinhis> for catconsult
And validate the general Treatment history as <Treathis> for catconsult
But validate the general Family history as <Famihis> for catconsult
Then validate the general Allergies as <Allerg> for catconsult
But validate the VA Right eye Un-Aided Distance as <VARUAD> for catconsult
When validate the VA Right eye Un-Aided Near as <VARUAN> for catconsult
But validate the VA Left eye Un-Aided Distance as <VALUAD> for catconsult
And validate the VA Left eye Un-Aided Near as <VALUAN> for catconsult
Then validate the VA Right eye Aided Dist as <RAD> for catconsult
But validate the VA Right eye Aided Near as <RAN> for catconsult
When validate the VA Left eye Aided Dist as <LAD> for catconsult
And validate the VA Left eye Aided Near as <LAN> for catconsult
But validate the VA Right eye Pinhole as <Rpinhole> for catconsult
Then validate the VA Left eye Pinhole as <Lpinhole> for catconsult
When validate the subjective acceptance of Right eyeDV Sphere as <RightDVSPH> for catconsult
And validate the subjective acceptance value of Right eyeDV Cylinder as <RightDVCYL> for catconsult
But validate the subjective acceptance value of Right eyeDV Axis as <RightDVAxis> for catconsult
Then validate the subjective acceptance value of Right eyeDV Visual Acuity as <RightDVVA> for catconsult
When validate the subjective acceptance value of Left eyeDV Sphere as <LeftDVSPH> for catconsult
And validate the subjective acceptance value of Left eyeDV Cylinder as <LeftDVCYL> for catconsult
But validate the subjective acceptance value of Left eyeDV Axis as <LeftDVAxis> for catconsult
Then validate the subjective acceptance value of Left eyeDV Visual Acuity as <LeftDVVA> for catconsult
When validate the subjective acceptance value of Right eyeNV Sphere as <RightNVSPH> for catconsult
And validate the subjective acceptance value of Right eyeNV Cylinder for catconsult
But validate the subjective acceptance value of Right eyeNV Axis for catconsult
Then validate the subjective acceptance value of Right eyeNV Visual Acuity as <RightNVVA> for catconsult
When validate the subjective acceptance value of Left eyeNV Sphere as <LeftNVSPH> for catconsult
And validate the subjective acceptance value of Left eyeNV Cylinder for catconsult
But validate the subjective acceptance value of Left eyeNV Axis for catconsult
And validate the subjective acceptance value of Left eyeNV Visual Acuity as <LeftNVVA> for catconsult
When validate the value of Right eye Schiotz max, min as <RSMAX>, <RSMIN> for catconsult
And validate the value of Left eye Schiotz max, min as <LSMAX>, <LSMIN> for catconsult
When validate the value of Right eye Applanation max, min as <RAMAX>, <RAMIN> for catconsult
And validate the value of Left eye Applanation max, min as <LAMAX>, <LAMIN> for catconsult
When validate the value of Right eye Non-Contact max, min as <RNCMAX>, <RNCMIN> for catconsult
And validate the value of Left eye Non-Contact max, min as <LNCMAX>, <LNCMIN> for catconsult
But Check the right eye Diagnosis values are as <Righteyediagnosis> for catconsult
And Check the left eye Diagnosis values are as <Lefteyediagnosis> for catconsult
When Give the Advice in report as <Advice> for catconsult
When Whether do you to select the report title or diagnosis as <titlediagnosis>, then report title or diagnosis values are as <reporttemp> for catconsult
Then Click the surgery button
When select the operation type as <opetype>
And select the operation name as <opename>
But which eye want to do the opearation for this patient as <eyes>
Given Give the general notes for operation as <generalnotes>
Then click to save the surgery info and assign to next room


Examples:
|Browser|URL|User|Pass|Patientid|Appfrom|Appto|Age|Sex|Contactno|Procedure|Chiefcomp|Presentcomp|Hisprescomp|Preocuhis|Sysilln|Clinhis|Treathis|Famihis|Allerg|VARUAD|VARUAN|VALUAD|VALUAN|RAD|RAN|LAD|LAN|Rpinhole|Lpinhole|RightDVSPH|RightDVCYL|RightDVAxis|RightDVVA|LeftDVSPH|LeftDVCYL|LeftDVAxis|LeftDVVA|RightNVSPH|RightNVVA|LeftNVSPH|LeftNVVA|RSMAX|RSMIN|LSMAX|LSMIN|RAMAX|RAMIN|LAMAX|LAMIN|RNCMAX|RNCMIN|LNCMAX|LNCMIN|Righteyediagnosis|Lefteyediagnosis|Advice|titlediagnosis|reporttemp|opetype|opename|eyes|generalnotes|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@con.in|password|pellu057|2-Aug-2018|2-Aug-2018|1 Year|Male|7845488305|eyecare|None|Yes|None|Yes|None|Yes|None|Yes|None|6/6|N1|6/18|N1|6/6|N1|6/18|N1|6/6|6/6|-0.25|-0.25|1|6/6|-0.25|-0.25|1|6/6|-0.25|N1|-0.25|N1|1|.9|1|.9|1|.9|1|.9|1|.9|1|.9|Blepharitis,Trichiasis,Ptrygium|Blepharitis,Trichiasis,Ptrygium|Surgery|Title|eye near|Appendectomy|Eye lense|Right|SABsdhfhdf|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@con.in|password|pellu058|2-Aug-2018|2-Aug-2018|99 Years|Male|7845488305|eye damage|None|Yes|None|Yes|None|Yes|None|Yes|None|6/36p|N5|6/60|N5|6/36p|N5|6/60|N5|6/36p|6/36p|-20.00|-6.00|15|5/60p|-20.00|-6.00|15|5/60p|-20.00|N5|-20.00|N5|20|.5|20|.5|20|.5|20|.5|20|.5|20|.5|Entropion,Trichiasis,Conjunctivitis-Allergic|Corneal ulcer-Bacterial|Surgery|Title|eye distance|Cataract surgery|Retinal cells|Left|asdd|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@con.in|password|pellu059|2-Aug-2018|2-Aug-2018|1 Day|Male|7845488305|eyecare|None|Yes|None|Yes|None|Yes|None|Yes|None|1/60p|N24|FCF|N24|1/60p|N24|FCF|N24|1/60p|1/60p|0.00|+0.25|99|1/60p|0.00|+0.25|99|1/60p|0.00|N6|0.00|N6|40|.3|40|.3|40|.3|40|.3|40|.3|40|.3|Conjunctivitis-Bacterial|Conjunctivitis-Viral|Surgery|Title|eye normal|Cesarean section|cesarean cell|Right|asdd|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@con.in|password|pellu061|2-Aug-2018|2-Aug-2018|28 Years|Female|7845488305|eye damage|None|Yes|None|Yes|None|Yes|None|Yes|None|NoPL|N36|NoPL|N36|NoPL|N36|NoPL|N36|No PL|No PL|+20.00|+6.00|180|No PL|+20.00|+6.00|180|No PL|+20.00|N36|+20.00|N36|60|.0|60|.0|50|.0|60|.0|60|.0|60|.0|Corneal Abrasion,Corneal foreign body|Corneal ulcer-Bacterial|Surgery|Title|eye distance|Cesarean section|cesarean cell|Both|asdd|

