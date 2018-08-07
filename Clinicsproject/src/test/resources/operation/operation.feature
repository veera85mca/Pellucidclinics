Feature: Operation room for end to end testing

@operation
Scenario Outline: Test the operation room after the ward for clinics

Given select the browser as <Browser>
When give the url as <Url>
And enter the username as <User>
But enter the password as <Pass>
Then click to login button
When click to worklist coloumn
And select the search filter icon for search
Then give the patientid as <Patientid> in search field
But select the app from date as <Appfrom>
And select the app to date as <Appto>
Then click to search button
And Click to pre operation info icon for validate all values
When Validate patientid in pre operative examination for opearation
But Validate BSL maximum and minimum as <BSLMax>, <BSLMin> in pre operative examination for opearation
Then Validate HB maximum and minimum as <HBMax>, <HBMin> in pre operative examination for opearation
And Validate Rs value as <RSmmHg> in pre operative examination for opearation
When Validate CVC values as <CVCmmHg> in pre operative examination for opearation
But Validate CNS values as <CNSmmHg> in pre operative examination for opearation
Then Validate P/A values as <PAmmHg> in pre operative examination for opearation
And Validate Temperature value as <Temp> <celsius> in pre operative examination for opearation
When Validate Pulse value as <Pulse> in pre operative examination for opearation
But Validate Bp maximum and minimum as <BpMax>, <BpMin> in pre operative examination for opearation
Then Validate RR maximum and minimum as <RRMax>, <RRMin> in pre operative examination for opearation
And Validate ECG Finding as <ECG> in pre operative examination for opearation
When Validate patient Fit for surgery as <fitsurgery> in pre operative examination for opearation
But Validate patient need Physician opinion as <phyopinion> in pre operative examination for opearation
And Validate patient need Treatment as <Treat>, then give advice as <advice> in pre operative examination for opearation
When click to save the operated information icon in worklist
And select the Operated surgeon name in operation room as <Surgeon>
But enter the Co-surgeon in operation room as <Cosurgeon>
When give the Anesthesia Doctor name in operation room as <Anesthesianame>
But add the name of Helpers as <Helpers>
And add the General notes of operation as <General>
Then click to save Post operation information


Examples:
|Browser|Url|User|Pass|Patientid|Appfrom|Appto|BSLMax|BSLMin|HBmax|HBmin|RSmmHg|CVCmmHg|CNSmmHg|PAmmHg|Temp|celsius|Pulse|BpMax|BpMin|RRMax|RRMin|ECG|fitsurgery|phyopinion|Treat|advice|Surgeon|Cosurgeon|Anesthesianame|Helpers|General|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@ope.in|password|pellu057|2-Aug-2018|2-Aug-2018|51|50|5|.1|65463|45|131|5465|90|.1|30|55|50|55|50|35131|Yes|Yes|Yes|Nothing|consultation|Raju|karthi|Amsa|eye drop|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@ope.in|password|pellu058|2-Aug-2018|2-Aug-2018|500|499|7|.2|65463|45|131|5465|95|.2|40|60|50|60|50|35131|Yes|Yes|Yes|Nothing|consultation|Raju|karthi|Amsa|eye drop|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@ope.in|password|pellu059|2-Aug-2018|2-Aug-2018|250|200|9|.3|65463|45|131|5465|100|.3|50|70|60|70|60|35132|Yes|Yes|Yes|Nothing|consultation|Raju|karthi|Amsa|eye drop|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@ope.in|password|pellu061|2-Aug-2018|2-Aug-2018|300|52|13|.5|65463|45|131|5465|120|.5|70|100|80|100|80|35134|Yes|Yes|Yes|Nothing|consultation|Raju|karthi|Amsa|eye drop|


@directoperation
Scenario Outline: Test the operation room features, directly from counselling room

Given select the browser for direct operation as <DBrowser>
When enter the url for direct operation as <DUrl>
And enter the user name for direct operation as <DUser>
But enter the password for direct operation as <DPass>
Then click to login button for direct operation
When click to worklist coloumn for direct operation
And select the search filter icon for direct operation
Then give the patientid for direct operation as <DPatientid> in search field
But select the app from date for direct operation as <DAppfrom>
And select the app to date for direct operation as <DAppto>
Then click to search button for direct operation
But click to add the Anesthesia Consent in worklist for direct operation
When click the event of Fill Anesthesia Form for direct operation and give Name of Physician as <DPhysician> in operation
And click to pre operation info and validate the patientid for direct operation
Then select the Blood report for direct operation BSL maximum as <DBSLMax> and minimum as <DBSLMin> in Operation
But select Blood report HB <DHBmax> <DHBmin> with percentage for direct operation
When give Rs value as <DRSmmHg> in examination for direct operation
And give CVC values as <DCVCmmHg> in examination for direct operation
But give CNS values as <DCNSmmHg> in examination for direct operation
When give P/A values as <DPAmmHg> in examination for direct operation
Then give Temperature value as <DTemp> <Dcelsius> in examination for direct operation
And give Pulse value as <DPulse> in examination for direct operation
But enter Bp maximum for direct operation as <DBpMax> and minimum as <DBpMin> in operation
When enter RR maximum for direct operation as <DRRMax> and minimum as <DRRMin> in operation
And give ECG Finding as <DECG> in examination for direct operation
When Is this patient Fit for surgery for direct operation as <Dfitsurgery>
And Is this patient need Physician opinion for direct operation as <Dphyopinion>
But Is this patient need Treatment for direct operation as <DTreat>, then give advice as <Dadvice> in operation
Then Click to save the preoperative examination details for direct operation
When click to save the operated information icon in worklist for direct operation
And select the Operated surgeon name in operation room for direct operation as <DSurgeon>
But enter the Co-surgeon in operation room for direct operation as <DCosurgeon>
When give the Anesthesia Doctor name in operation room for direct operation as <DAnesthesianame>
But add the name of Helpers for direct operation as <DHelpers>
And add the General notes of operation for direct operation as <DGeneral>
Then click to save Post operation information for direct operation

Examples:
|DBrowser|DUrl|DUser|DPass|DPatientid|DAppfrom|DAppto||DPhysician|DBSLMax|DBSLMin|DHBmax|DHBmin|DRSmmHg|DCVCmmHg|DCNSmmHg|DPAmmHg|DTemp|Dcelsius|DPulse|DBpMax|DBpMin|DRRMax|DRRMin|DECG|Dfitsurgery|Dphyopinion|DTreat|Dadvice|DSurgeon|DCosurgeon|DAnesthesianame|DHelpers|DGeneral|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@ope.in|password|pellu064|1-Aug-2018|1-Aug-2018||veera|51|50|5|.1|65463|45|131|5465|90|.1|30|55|50|55|50|35131|Yes|Yes|Yes|Nothing|consultation|Raju|karthi|Amsa|eye drop|












