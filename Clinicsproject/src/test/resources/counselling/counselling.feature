Feature: Test the Counselling room

@surgerycounsel
Scenario Outline: Test the surgery workflow in counselling room

Given select the browser for counsel as <Browser>
When give the counsel url as <Url>
And give the counsel username as <User>
But enter the counsel password as <Pass>
Then click the login button
Given click to counsel worklist
When click the searchfilter for counsel
And give the patient id as <Patientid> for search in counsel
But select the application from date as <Appfrom> for counsel
And select the application to date as <Appto> for counsel
Then click to search button for counsel
But get the patient age and agelimit as <Agelimit> for fill surgery content form
When click to add the surgery consent icon and click the form, then you want to surgery, even patient age is below agelimit as <Cont>, then parent name as <Parent>
And click to add the surgery icon for counsel
Then Validate the Surgerytype as <Surgerytype>, surgeryname as <Surgeryname> and eye to operated as <Eye>
When Validate the surgery name from respective function for counsel and save
When Click to add the IOL details for counsel
And Select the lense name for counsel as <Lensname>
But give the remarks at iol lense for counsel as <Remarkslens>
Then Click to save the IOL details in counsel
When Click to admission for surgery in counsel
Then Would you like to select an unit as <Coununit> for counsel
And Select the ward for counsel as <Counward>
When select the bed in particular ward for counsel
But Eye to be operated if both as <Both> then mention as <Side> eye
Then Admit the case assign to operation, when the unit is empty, otherwise assign to ward in counsel

Examples:
|Browser|Url|User|Pass|Patientid|Appfrom|Appto|Agelimit|Cont|Parent|Surgerytype|Surgeryname|Eye|Lensname|Remarkslens|Coununit|Counward|Both|Side|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu057|2-Aug-2018|2-Aug-2018|17 Years|yes|Veera|Appendectomy|Eye lense|Right|eye rare - Indian Lens (6732) - Standard lens (monofocal)|Nothing|autounit|Deluxe Ward|No|Right|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu059|2-Aug-2018|2-Aug-2018|17 Years|yes|Veera|Cesarean section|cesarean cell|Right|eye rare - Indian Lens (6732) - Standard lens (monofocal)|Nothing|autounit|Private Ward|No|Right|



@packagecounsel
Scenario Outline: Test the package workflow in counselling room

Given Select the browser for package in counsel as <PBrowser>
And enter the url for package in counsel as <PUrl>
When enter the username for package in counsel as <PUser>
But enter the password for package in counsel as <PPass>
Then click to login for package in counsel
Given click to counsel worklist for package
When click the searchfilter for package
And give the patient id as <PPatientid> for search in counsel for package
But select the application from date as <PAppfrom> for counsel for package
And select the application to date as <PAppto> for counsel for package
Then click to search button for package
But get the patient age and agelimit for package as <PAgelimit> for fill surgery content form
When click to add the surgery consent icon for package and click the form, then you want to surgery, even patient age is below agelimit as <PCont>, then parent name as <PParent>
And click to package or surgery icon in counsell
When Validate the Surgerytype, surgeryname and eye to operated as <PSurgerytype>, <PSurgeryname>, <PEye> in doctor recommendation for package
Then Enter the package name as <PPackage> and save for package workflow in counsell
And Assign the patient to next room for package workflow in counsel


Examples:
|PBrowser|PUrl|PUser|PPass|PPatientid|PAppfrom|PAppto|PAgelimit|PCont|Pparent|PSurgerytype|PSurgeryname|PEye|PPackage|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu065|1-Aug-2018|1-Aug-2018|17 Years|yes|veera|Mastectomy|eye routine|Left|Best sum package|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu067|1-Aug-2018|1-Aug-2018|17 Years|yes|veera|Appendectomy|Eye lense|Right|Retina sum package|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu068|1-Aug-2018|1-Aug-2018|17 Years|yes|veera|Cataract surgery|Retinal cells|Left|Poverty sum package|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu069|1-Aug-2018|1-Aug-2018|17 Years|yes|veera|Cesarean section|cesarean cell|Both|Luxury sum package|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu070|1-Aug-2018|1-Aug-2018|17 Years|yes|veera|Mastectomy|eye routine|Both|Best sum package|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu074|1-Aug-2018|1-Aug-2018|17 Years|yes|veera|Appendectomy|Eye lense|Both|Retina sum package|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu075|1-Aug-2018|1-Aug-2018|17 Years|yes|veera|Cataract surgery|Retinal cells|Both|Poverty sum package|



@reporttedcounsel
Scenario Outline: Test the post operation info after reported in counselling room

Given Select the browser for post operation in counsel as <PostBrowser>
And enter the url for post operation in counsel as <PostUrl>
When enter the username for post operation in counsel as <PostUser>
But enter the password for post operation in counsel as <PostPass>
Then click to login for post operation in counsel
Given click to worklist for post operation
When click the searchfilter for post operation
And give the patient id for post operation as <PostPatientid> in search filter
But select the application from date for post operation as <PostAppfrom> in search filter
And select the application to date for post operation as <PostAppto> in search filter
Then click to search button for post operation
And Select the Reported tab for post operation
When click to post Visual Acuity icon in worklist
And select the visual acuity unit type as <PostUnit> for post operation
But select the value of post VA Right eye Un-Aided Dist as <PostRUAD>
And Select the post VA Right eye Un-Aided Near as <PostRUAN>
When Select the post VA Left eye Un-Aided Dist as <PostLUAD>
And Select the post VA Left eye Un-Aided Near as <PostLUAN>
Given select the post VA Right eye Aided Dist as <PostRAD>
But Select the post VA Right eye Aided Near as <PostRAN>
When Select the post VA Left eye Aided Dist as <PostLAD>
Then Select the post VA Left eye Aided Near as <PostLAN>
And Select the post VA Right eye Pinhole as <PostRpinhole>
But Select the post VA Left eye Pinhole as <PostLpinhole>
Then Click to save the post VA values
And Click to post VA add medicine content icon in worklist
When Select the medicine template title as <PostMedicine> for post VA
But Click to save the medicine content for post VA

Examples:
|PostBrowser|PostUrl|PostUser|PostPass|PostPatientid|PostAppfrom|PostAppto|PostUnit|PostRUAD|PostRUAN|PostLUAD|PostLUAN|PostRAD|PostRAN|PostLAD|PostLAN|PostRpinhole|PostLpinhole|PostMedicine|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu057|2-Aug-2018|2-Aug-2018|Snellen(Meters)|1/60|N24|FCF|N24|1/60|N24|FCF|N24|1/60|1/60|Ractone tablet|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu058|2-Aug-2018|2-Aug-2018|Decimal|NoPL|N36|NoPL|N36|NoPL|N36|NoPL|N36|NoPL|NoPL|Techeye|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu059|2-Aug-2018|2-Aug-2018|Log MAR|>+3.0|N24|>+3.0|N24|>+3.0|N24|>+3.0|N24|No improvement|No improvement|tycon eye roar|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@cou.in|password|pellu061|2-Aug-2018|2-Aug-2018|Snellen(Feet)|20/20|N24|20/20|N24|20/20|N24|20/20|N24|No improvement|No improvement|Waneyebar|

