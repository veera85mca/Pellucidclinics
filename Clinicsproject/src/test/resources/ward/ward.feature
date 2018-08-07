Feature: Test all the features of ward room

@ward
Scenario Outline: Test the Anesthesia and pre operation information for ward room

Given select the browser for ward as <Browser>
When give the url for ward as <Url>
And enter the user name for ward as <User>
But enter the password for ward as <Pass>
Then click to login button for ward
When click to worklist in wardroom
Given want to select the tab of ward as <ward>
And click to search filter for ward
When enter the patientid as <Patientid> in search for ward
But select the application start dates for ward as <Appfrom>
And select the application till date for ward as <Appto> and then search
But click to add the Anesthesia Consent for ward
When click the event of Fill Anesthesia Form and give Name of Physician as <Physician> in ward
And click to add pre operation info and validate the patientid in ward
Then select the Blood report BSL maximum as <BSLMax> and minimum as <BSLMin>
But select the Blood report HB <HBmax> <HBmin> with percentage
When give the Rs value as <RSmmHg> in examination
And give the CVC values as <CVCmmHg> in examination
But give the CNS values as <CNSmmHg> in examination
When give the P/A values as <PAmmHg> in examination
Then give the Temperature value as <Temp> <celsius> in examination 
And give the Pulse value as <Pulse> in examination
But enter the Bp maximum as <BpMax> and minimum as <BpMin>
When enter the RR maximum as <RRMax> and minimum as <RRMin>
And give the ECG Finding as <ECG> in examination
When Is this patient Fit for surgery as <fitsurgery>
And Is this patient need Physician opinion as <phyopinion>
But Is this patient need Treatment as <Treat>, then give advice as <advice> 
Then Click to save the preoperative examination details
And Would you like to do the postpone operation as <Postpone>, then date <Postdate>, time <Posttime> and reason <Reason>  to this patient in ward
When Are you assign to operation room as <Assign>

Examples:
|Browser|Url|User|Pass|ward|Patientid|Appfrom|Appto|Physician|BSLMax|BSLMin|HBmax|HBmin|RSmmHg|CVCmmHg|CNSmmHg|PAmmHg|Temp|celsius|Pulse|BpMax|BpMin|RRMax|RRMin|ECG|fitsurgery|phyopinion|Treat|advice|Postpone|Postdate|Posttime|Reason|Assign|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@war.in|password|Deluxe Ward|pellu057|2-Aug-2018|2-Aug-2018|Veera|51|50|5|.1|65463|45|131|5465|90|.1|30|55|50|55|50|35131|Yes|Yes|Yes|Nothing|No||||Yes|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@war.in|password|Semi Deluxe Ward|pellu058|2-Aug-2018|2-Aug-2018|Veera|500|499|7|.2|65463|45|131|5465|95|.2|40|60|50|60|50|35131|Yes|Yes|Yes|Nothing|No||||Yes|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@war.in|password|Private Ward|pellu059|2-Aug-2018|2-Aug-2018|Veera|250|200|9|.3|65463|45|131|5465|100|.3|50|70|60|70|60|35132|Yes|Yes|Yes|Nothing|No||||Yes|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@war.in|password|Free Female ward|pellu061|2-Aug-2018|2-Aug-2018|Veera|300|52|13|.5|65463|45|131|5465|120|.5|70|100|80|100|80|35134|Yes|Yes|Yes|Nothing|No||||Yes|

@wardpackage
Scenario Outline: Test the bed selection for Package patient in ward

Given Select the browser package for ward as <WBrowser>
And Enter the url package for ward as <WUrl>
But Enter the user package for ward as <WUser>
When Enter the password package for ward as <WPass>
Then Click to login package for ward
When click to worklist for package in wardroom
Given want to select the tab of ward for package as <Wward>
And click to search filter for packgae ward
When enter the patientid for package as <WPatientid> in search for ward
But select the application start dates for packgae ward as <WAppfrom>
And select the application till date for packgae ward as <WAppto> and then search
But click to add the Anesthesia Consent for package ward
When click the event of Fill Anesthesia Form for package and give Name of Physician as <WPhysician> in ward
And click to add pre operation info and validate the patientid for package in ward
Then select the Blood report for package BSL maximum as <WBSLMax> and minimum as <WBSLMin> in ward
But select the Blood report HB <WHBmax> <WHBmin> with percentage for package in ward
When give the Rs value as <WRSmmHg> in examination for package in ward
And give the CVC values as <WCVCmmHg> in examination for package in ward
But give the CNS values as <WCNSmmHg> in examination for package in ward
When give the P/A values as <WPAmmHg> in examination for package in ward
Then give the Temperature value as <WTemp> <Wcelsius> in examination for package in ward
And give the Pulse value as <WPulse> in examination for package in ward
But enter the Bp maximum for package as <WBpMax> and minimum as <WBpMin> in ward
When enter the RR maximum for package as <WRRMax> and minimum as <WRRMin> in ward
And give the ECG Finding as <WECG> in examination for package in ward
When Is this patient Fit for surgery for package as <Wfitsurgery> in ward
And Is this patient need Physician opinion for package as <Wphyopinion> in ward
But Is this patient need Treatment for package as <WTreat>, then give advice as <Wadvice> in ward
Then Click to save the preoperative examination details for package in ward
When Would you like to select the bed for this patient in package ward
Then Validate if both eyes to operated as <WBoth> and then validate or select the Eye to be operated as <WEye> for package ward
But Select the operation date as <Woperationdate> for package ward
Given Select the Operation Time as <Woperationtime> for package ward
And Click to admit button and assign for package ward

Examples:
|WBrowser|WUrl|WUser|WPass|Wward|WPatientid|WAppfrom|WAppto|WPhysician|WBSLMax|WBSLMin|WHBmax|WHBmin|WRSmmHg|WCVCmmHg|WCNSmmHg|WPAmmHg|WTemp|Wcelsius|WPulse|WBpMax|WBpMin|WRRMax|WRRMin|WECG|Wfitsurgery|Wphyopinion|WTreat|Wadvice|WBoth|WEye|Woperationdate|Woperationtime|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@war.in|password|Deluxe Ward|pellu067|1-Aug-2018|1-Aug-2018|veera|500|499|7|.2|65463|45|131|5465|95|.2|40|60|50|60|50|35131|Yes|Yes|Yes|Nothing|No|Right|3 Aug 2018|02:00 PM - 02:59 PM|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@war.in|password|Private Ward|pellu069|1-Aug-2018|1-Aug-2018|veera|100|50|11|.4|65463|45|131|5465|110|.4|60|80|70|80|70|35133|Yes|Yes|Yes|Nothing|Yes|Right|3 Aug 2018|04:00 PM - 04:59 PM|


