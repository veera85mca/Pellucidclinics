Feature: Test the patient registration

@regpatient
Scenario Outline: Test the registration for patient
Given select the browsers as <Browser>
When enter the urls as <Url>
And enter the usernames as <Username>
But enter the passwords as <Password>
And check the radios button
Then click to logins button
When click to Registration button
Given select the priority of patient as <Priority>
And Is the patient id auto as <Auto> enter the patient id as <Id>
Then enter the firstname as <First>
When enter the middlename as <Middle>
But enter the lastname as <Last>
Then select the patientage as <Age>
When select the patientsex as <Sex>
And select the marital status as <Marital>
But need to select salutation except Mr,Ms,Mrs,Baby that already automated so give as <Salutation>
But enter the mr number as <Mrno>
When enter the contact no as <Mobileno>
And enter the patient emailid as <emailid>
When select the patient type of id as <idcard>
But enter the patient id card number as <idcardno>
And select the patient Ethnic group as <ethnic>
When Select the Insurance company as <Insurcompany>
And Select the insure Policy name as <Policyname>
Given Enter the Insurance no as <Insureno>
But Enter the Name of the insurer as <Insurename>
But enter the patient Place of birth as <Native>
And Enter the patient Occupation as <Occupation>
Then Select the patient Blood group as <Bloodgroup>
When Enter the patient Weight as <Weight>
But Enter the patient nationality as <Nationality>
Then Select the patient address country as <Country>
And Select the patient state as <State>
When Enter the patient City as <City>
Given Enter the patient street or area as <Street>
But Enter the patient state zipcode as <Zipcode>
When give the Privilege card no as <Privilegeno>
And Enter the patient alternate mobile no as <altermobile>
Then get the selected patient type as automated
When select the referral type as <Referraltype>, and give the name of referral as <Referralname>
But select to upload the patient image
And enter the standing order as <Standingorder>
Then select the patient Procedure name as <Procedure>
Then enter the general notes as <Generalnotes>
When If age is below <Agelimit>, click to notification and then save button
But register and assign to next room
Then match the patient id, type, age and sex on Billing transaction then only save the button
Given Click to logout patient registration

Examples:
|Browser|Url|Username|Password|Priority|Auto|Id|First|Middle|Last|Age|Sex|Marital|Salutation|Mrno|Mobileno|emailid|idcard|idcardno|ethnic|Insurcompany|Policyname|Insureno|Insurename|Native|Occupation|Bloodgroup|Weight|Nationality|Country|State|City|Street|Zipcode|Privilegeno|altermobile|Referraltype|Referralname|Standingorder|Procedure|Generalnotes|Agelimit|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|Normal|yes|none|Veera|pathiran|pandian|1 Year|Male|Single|Baby|AEGR1234|7845488305|auto@reg.in|Voter ID|56730AFH|General|LIC|Jevan|4521382|Veera|Kalayarkovil|Farmer|B+ve|5|Indian|India|Kerala|Idukki|ragave street|651024|Asdfh7894|7845488600|Self||Adgsh78945|eyecare|Noted|17|


@regpatientvisit
Scenario Outline: Test the patients next visit registration
Given Select the regis visit browser as <vbrowse>
When enter the regis visit Url as <vurl>
And enter the regis visit user as <vusername>
But enter the regis visit pass as <vpass>
Then click to regis visit login
When click to Registration button for next visit
Then click to search button and patientid as <Patiid> for the visit
And click to respectiive patientid for next visit registration
When Select the Previous visit history as <Visitno>
And Validate the priority details for visit as <Vpriority>
But Validate patientid for visit in registration
And Validate firstname for visit in registration as <Vfirst>
But Validate middlename for visit in registration as <Vmiddle>
When Validate lastname for visit in registration as <Vlast>
Then Validate age for visit in registration as <Vage>
Given Validate sex for visit in registration as <Vsex>
And Validate marital for visit in registration as <Vmarital>
Then Validate the salutation for visit in registration as <Vsalutation>
But Validate mrno for visit in registration as <Vmrno>
Then Validate mobileno for visit in registration as <Vmobileno>
Given Validate emailid for visit in registration as <Vemailid>
But Validate idcard for visit in registration as <Vidcard>
And Validate idcardno for visit in registration as <Vidcardno>
Then Validate ethnic for visit in registration as <Vethnic>
When Validate Insurance company for visit in registration as <VInsurcompany>
And Validate insure Policy name for visit in registration as <VPolicyname>
Given Validate Insurance no for visit in registration as <VInsureno>
But Validate Name of the insurer for visit in registration as <VInsurename>
Given Validate the Place of birth for visit in registration as <VPOB>
But Validate the Occupation for visit in registration as <VOccupa>
Given Validate the Blood group for visit in registration as <VBG>
And Validate the Weight for visit in registration as <VWeight>
Then Validate the Nationality for visit in registration as <VNation>
But Validate the Country for visit in registration as <VCountry>
Given Validate the State for visit in registration as <VState>
When Validate the City for visit in registration as <VCity>
And Validate the Street for visit in registration as <VStreet>
Then Validate the Zip code for visit in registration as <VZipcode>
When Validate the Privilege card no for visit in registration as <VPrivilegeno>
Then Validate the Mobile no others for visit in registration as <Valtermobile>
When Validate the patient visit count in registration
When Validate the referral type for visit as <VReferraltype>, and respective name of referral for visit as <VReferralname>
But Validate the Standing order for visit in registration as <Vstandorder>
And Validate the Procedure name for visit in registration as <Vprocedure>
Then Validate the general notes for visit in registration as <VGeneralnotes>
Then Validate the agelimit as <Vagelimit> and would like to click save or assign to others as <VSaveAssign> for visit registration
But Is this patient save means, then save and assign
And Is this patient assign to others, Would you click to direct doctor or assign lab as <VDoctorLab>, if lab then departments are as <Vfirstlab>, <Vsecondlab>, <Vthirdlab>, <Vfourthlab>
When Validate the patient id, type, age and sex on Billing transaction for visit patient then only save the button
Then click to logout after successfull visit registration

Examples:
|vbrowse|vurl|vusername|vpass|Patiid|Visitno|Vpriority|Vfirst|Vmiddle|Vlast|Vage|Vsex|Vmarital|Vsalutation|Vmrno|Vmobileno|Vemailid|Vidcard|Vidcardno|Vethnic|VInsurcompany|VPolicyname|VInsureno|VInsurename|VPOB|VOccupa|VBG|VWeight|VNation|VCountry|VState|VCity|VStreet|VZipcode|VPrivilegeno|Valtermobile|VReferraltype|VReferralname|Vstandorder|Vprocedure|VGeneralnotes|Vagelimit|VSaveAssign|VDoctorLab|Vfirstlab|Vsecondlab|Vthirdlab|Vfourthlab|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|pellu056|0|Normal|Veera|pathiran|pandian|1 Year|Male|Single|Baby|AEGR1234|7845488305|auto@reg.in|Voter ID|56730AFH|General|LIC|Jevan|4521382|Veera|Kalayarkovil|Farmer|B+ve|5|Indian|India|Kerala|Idukki|ragave street|651024|Asdfh7894|7845488600|Self||Adgsh78945|eyecare|Noted|17|Assign|Direct to doctor|||||
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|pellu057|0|Emergency case|Raju|muru|jai|99 Years|Male|Single|Mr|RAGHI|7845488305|auto@reg.in|Aadhar card|AFGSD4536|Vimukta Jati|LIC|Health|213545|Veera|Chennai|Police|O+ve|6|Indian|Bangladesh|Dhaka|Dohar|varahdth|651024|15132shsv|7845488600|Hospital|Ram|Adgsh78946|eye damage|Noted|17|Assign|Direct to doctor|||||
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|pellu058|0|VIP|Kosakki|Pasan|Enthi|1 Day|Male|Single|Baby|789413132|7845488305|auto@reg.in|Ration card|UAGD1556|OBC|LIC|Jevan|Afsgd7846|Raju|madurai|Army|A+ve|9|Indian|Singapore|Singapore|Singapore|emphis|643514|hdfjk7896|7845488600|Self||Adgsh78947|eyecare|Noted|17|Assign|Direct to doctor|||||
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|pellu059|0|Normal|Kosakki|Pasan|Enthi|45 Days|Male|Single|Baby|AEGR1234|7845488305|auto@reg.in|Pan card|56730AFH|SC|LIC|Health|76t7898|Veera|kovai|Software|AB+ve|10|Indian|Australia|Northern Territory|Sydney|millton road|9851|rlkdfk7861|7845488600|Hospital|Ram|Adgsh78948|eye damage|Noted|17|Assign|Direct to doctor|||||
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|pellu060|0|Normal|tamim|iqbal|hami|27 Years|Male|Others|Mr|AEGR1234|7845488305|auto@reg.in|BPL card|UAGD1556|Not Specified|LIC|Jevan|Afsgd7850|Veera|kovai|Farmer|B-ve|65|Indian|Japan|Gifu|Gifu|guskh|70484499.1238095|rlkdfk7864|7845488600|Vision center|vasan|Adgsh78963|eyecare|Noted|17|Assign|Direct to doctor|||||




