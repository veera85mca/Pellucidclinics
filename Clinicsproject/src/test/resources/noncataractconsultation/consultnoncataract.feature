Feature: Test the consultation room for noncataract

@consultnoncataract
Scenario Outline: Test the patients for noncataract in consultation room

Given select the browser for noncataract as <Browser>
When give the url for noncataract as <Url>
And enter the user name for noncataract as <User>
But enter the password for noncataract as <Pass>
Then click to login button for noncataract
When click to worklist colomn for noncataract
And click to search filter for noncataract
But give the patientid as <Patientid> for search in noncataract
When select the application from date as <Appfrom> for noncataract
And select the application to date as <Appto> for noncataract
Then click to search button for noncataract
When want to click the patient name respective of patient id for noncatconsult
And validate the patientid, age as <Age>, sex as <Sex>, contactno as <Contactno>, procedure as <Procedure> and then click casesheet tab for noncataract
When validate the general Chief compliants as <Chiefcomp> for noncatconsult
Given validate the general Presenting complaint as <Presentcomp> for noncatconsult
When validate the general History presenting complaint as <Hisprescomp> for noncatconsult
And validate the general Previous ocular history as <Preocuhis> for noncatconsult
Then validate the general Systemic Illness/History as <Sysilln> for noncatconsult
But validate the general Clinical history as <Clinhis> for noncatconsult
And validate the general Treatment history as <Treathis> for noncatconsult
But validate the general Family history as <Famihis> for noncatconsult
Then validate the general Allergies as <Allerg> for noncatconsult
But validate the VA Right eye Un-Aided Distance as <VARUAD> for noncatconsult
And validate the VA Right eye Un-Aided Near as <VARUAN> for noncatconsult
When validate the VA Left eye Un-Aided Distance as <VALUAD> for noncatconsult
And validate the VA Left eye Un-Aided Near as <VALUAN> for noncatconsult
Then validate the VA Right eye Aided Dist as <RAD> for noncatconsult
But validate the VA Right eye Aided Near as <RAN> for noncatconsult
When validate the VA Left eye Aided Dist as <LAD> for noncatconsult
And validate the VA Left eye Aided Near as <LAN> for noncatconsult
But validate the VA Right eye Pinhole as <Rpinhole> for noncatconsult
Then validate the VA Left eye Pinhole as <Lpinhole> for noncatconsult
When validate the subjective acceptance of Right eyeDV Sphere as <RightDVSPH> for noncatconsult
And validate the subjective acceptance value of Right eyeDV Cylinder as <RightDVCYL> for noncatconsult
But validate the subjective acceptance value of Right eyeDV Axis as <RightDVAxis> for noncatconsult
Then validate the subjective acceptance value of Right eyeDV Visual Acuity as <RightDVVA> for noncatconsult
When validate the subjective acceptance value of Left eyeDV Sphere as <LeftDVSPH> for noncatconsult
And validate the subjective acceptance value of Left eyeDV Cylinder as <LeftDVCYL> for noncatconsult
But validate the subjective acceptance value of Left eyeDV Axis as <LeftDVAxis> for noncatconsult
Then validate the subjective acceptance value of Left eyeDV Visual Acuity as <LeftDVVA> for noncatconsult
When validate the subjective acceptance value of Right eyeNV Sphere as <RightNVSPH> for noncatconsult
And validate the subjective acceptance value of Right eyeNV Cylinder for noncatconsult
But validate the subjective acceptance value of Right eyeNV Axis for noncatconsult
Then validate the subjective acceptance value of Right eyeNV Visual Acuity as <RightNVVA> for noncatconsult
When validate the subjective acceptance value of Left eyeNV Sphere as <LeftNVSPH> for noncatconsult
And validate the subjective acceptance value of Left eyeNV Cylinder for noncatconsult
But validate the subjective acceptance value of Left eyeNV Axis for noncatconsult
And validate the subjective acceptance value of Left eyeNV Visual Acuity as <LeftNVVA> for noncatconsult
When validate the value of Right eye Schiotz max, min as <RSMAX>, <RSMIN> for noncatconsult
And validate the value of Left eye Schiotz max, min as <LSMAX>, <LSMIN> for noncatconsult
When validate the value of Right eye Applanation max, min as <RAMAX>, <RAMIN> for noncatconsult
And validate the value of Left eye Applanation max, min as <LAMAX>, <LAMIN> for noncatconsult
When validate the value of Right eye Non-Contact max, min as <RNCMAX>, <RNCMIN> for noncatconsult
And validate the value of Left eye Non-Contact max, min as <LNCMAX>, <LNCMIN> for noncatconsult
But Check the right eye Diagnosis values as <Righteyediagnosis> for noncatconsult
And Check the left eye Diagnosis values as <Lefteyediagnosis> for noncatconsult
When Give the Advice to report as <Advice> for noncatconsult
But Whether do you to select the report title or diagnosis as <titlediagnosis>, then report title or diagnosis values are as <reporttemp> for noncatconsult
Then whether do you want to save as draft or finalize button as <Finalize> as noncatract
When select the value of Right eyeDV Sphere as <REDVSPH>
And select the value of Right eyeDV Cylinder as <REDVCYL>
But select the value of Right eyeDV Axis as <REDVAxis>
Then select the value of Right eyeDV Visual Acuity as <REDVVA>
When select the value of Left eyeDV Sphere as <LEDVSPH>
And select the value of Left eyeDV Cylinder as <LEDVCYL>
But select the value of Left eyeDV Axis as <LEDVAxis>
Then select the value of Left eyeDV Visual Acuity as <LEDVVA>
When select the value of Right eyeNV Sphere as <RENVSPH>
Then select the value of Right eyeNV Visual Acuity as <RENVVA>
When select the value of Left eyeNV Sphere as <LENVSPH>
But select the value of Left eyeNV Visual Acuity as <LENVVA>
And enter the Pupil distance value as <pupildistance> mm
Then give the Remarks as <remarks>
Then click to save the glass prescription
But select the template of medicine as <medicine>
Then click to save the medicine details

Examples:
|Browser|Url|User|Pass|Patientid|Appfrom|Appto|Age|Sex|Contactno|Procedure|Chiefcomp|Presentcomp|Hisprescomp|Preocuhis|Sysilln|Clinhis|Treathis|Famihis|Allerg|VARUAD|VARUAN|VALUAD|VALUAN|RAD|RAN|LAD|LAN|Rpinhole|Lpinhole|RightDVSPH|RightDVCYL|RightDVAxis|RightDVVA|LeftDVSPH|LeftDVCYL|LeftDVAxis|LeftDVVA|RightNVSPH|RightNVVA|LeftNVSPH|LeftNVVA|RSMAX|RSMIN|LSMAX|LSMIN|RAMAX|RAMIN|LAMAX|LAMIN|RNCMAX|RNCMIN|LNCMAX|LNCMIN|Righteyediagnosis|Lefteyediagnosis|Advice|titlediagnosis|reporttemp|Finalize|REDVSPH|REDVCYL|REDVAxis|REDVVA|LEDVSPH|LEDVCYL|LEDVAxis|LEDVVA|RENVSPH|RENVVA|LENVSPH|LENVVA|pupildistance|remarks|medicine|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@con.in|password|pellu063|2-Aug-2018|2-Aug-2018|1 Year|Male|7845488305|eyecare|None|Yes|None|Yes|None|Yes|None|Yes|None|6/6|N1|6/18|N1|6/6|N1|6/18|N1|6/6|6/6|-0.25|-0.25|1|6/6|-0.25|-0.25|1|6/6|-0.25|N1|-0.25|N1|1|.9|1|.9|1|.9|1|.9|1|.9|1|.9|Blepharitis,Trichiasis,Ptrygium|Blepharitis,Trichiasis,Ptrygium|Glass|Title|eye near|Finalize|Plano|+0.25|99|1/60p|Plano|+0.25|99|1/60p|Plano|N8|Plano|N8|1|Nothing|Ractone tablet|


@Savedraftcase
Scenario Outline: Test the case sheet of save as Draft and fix the noncatract

Given Select the save draft browser as <SBrowser>
When Enter the save draft url as <SUrl>
And enter the save draft user as <Susername>
But enter the save draft pass as <Spass>
Then click to save draft login
When click to worklist colomn for save draft
And click to search filter for save draft
But give the patientid as <SPatientid> for search in save draft
When select the application from date as <SAppfrom> for save draft
And select the application to date as <SAppto> for save draft
Then click to search button for save draft
When want to click the patient name respective of patient id for save draft
But Validate the right eye Diagnosis values as <SRightvalidiagnosis> for save draft
And Validate the left eye Diagnosis values as <SLeftvalidiagnosis> for save draft
Then Validate the Advice as <SAdvice>, and then Report title as <STitle>
Then do you want to finalize button or save draft as <SFinalize> for save draft workflow in noncatract
When select the value of Right eyeDV Sphere for save draft as <SREDVSPH>
And select the value of Right eyeDV Cylinder for save draft as <SREDVCYL>
But select the value of Right eyeDV Axis for save draft as <SREDVAxis>
Then select the value of Right eyeDV Visual Acuity for save draft as <SREDVVA>
When select the value of Left eyeDV Sphere for save draft as <SLEDVSPH>
And select the value of Left eyeDV Cylinder for save draft as <SLEDVCYL>
But select the value of Left eyeDV Axis for save draft as <SLEDVAxis>
Then select the value of Left eyeDV Visual Acuity for save draft as <SLEDVVA>
When select the value of Right eyeNV Sphere for save draft as <SRENVSPH>
Then select the value of Right eyeNV Visual Acuity for save draft as <SRENVVA>
When select the value of Left eyeNV Sphere for save draft as <SLENVSPH>
But select the value of Left eyeNV Visual Acuity for save draft as <SLENVVA>
And enter the Pupil distance value for save draft as <Spupildistance> mm
Then give the Remarks for save draft as <Sremarks>
Then click to save the glass prescription for save draft
But select the template of medicine for save draft as <Smedicine>
Then click to save the medicine details for save draft

Examples:
|SBrowser|SUrl|Susername|Spass|SPatientid|SAppfrom|SAppto|SRightvalidiagnosis|SLeftvalidiagnosis|SAdvice|STitle|SFinalize|SREDVSPH|SREDVCYL|SREDVAxis|SREDVVA|SLEDVSPH|SLEDVCYL|SLEDVAxis|SLEDVVA|SRENVSPH|SRENVVA|SLENVSPH|SLENVVA|Spupildistance|Sremarks|Smedicine|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@con.in|password|pellu063|1-Aug-2018|1-Aug-2018|Blepharitis,Trichiasis,Ptrygium|Blepharitis,Trichiasis,Ptrygium|Glass|eye near|Finalize|0.00|+0.25|99|1/60p|0.00|+0.25|99|1/60p|0.00|N24|0.00|N24|1|Nothing|Ractone tablet|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@con.in|password|pellu066|1-Aug-2018|1-Aug-2018|Entropion,Trichiasis,Conjunctivitis-Allergic|Corneal ulcer-Bacterial|Glass|eye near|Finalize|-2.25|-2.25|36|6/36|-2.25|-2.25|78|6/36|-2.25|N36|-2.25|N36|45|eye damage|Ractone tablet|


@addaddendum
Scenario Outline: Test the add addendum of finalize cases for non catract

Given Select the add addendum browser as <ABrowser>
When Enter the add addendum url as <AUrl>
And enter the add addendum user as <Ausername>
But enter the add addendum pass as <Apass>
Then click to add addendum login
When click to worklist colomn for add addendum
And click the report tab in worklist for add addendum
And click to search filter for add addendum
But give the patientid as <APatientid> for search in add addendum
When select the application from date as <AAppfrom> for add addendum
And select the application to date as <AAppto> for add addendum
Then click to search button for add addendum
When want to click the patient name respective of patient id for add addendum
But Click to add addendum button in casesheet and addendum as <Aaddendum>
Then Click to save button the add addendum

Examples:
|ABrowser|AUrl|Ausername|Apass|APatientid|AAppfrom|AAppto|Aaddendum|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@con.in|password|pellu061|26-Mar-2018|26-Mar-2018|Normal|

