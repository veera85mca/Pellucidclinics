Feature: Test the lab Registration room

@labpatient
Scenario Outline: Test the lab patient registration in registration room

Given select the browser as <Browser>
When enter the url as <Url>
And enter the username as <Username>
But enter the password as <Password>
And check the radio button
Then click to login button
When Click the lab registration button
And enter lab patient first name as <First name>
When enter the lab patient contact no as <Contact no>
But enter lab patient last name as <Last name>
And select the age as <Age>
When select the sex as <Sex>
But enter the referred by as <Referred by>
Then click the registration button and save the changes
When do you want check the Haemoglobin report as <Haemoglobin>
But do you want to check the TC report as <TC>
And do you want to check the DC report as <DC>
Then do you want check the RBC Count as <RBC>
Then need to save these changes

Examples:
|Browser|Url|Username|Password|First name|Contact no|Last name|Age|Sex|Referred by|Haemoglobin|TC|DC|RBC|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|Rich|7894681231|war|35 Years|Male|Miot hospital|Check|Check|Check|Uncheck|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|Raja|4575868|ram|18 Years|Male|Dr.prasad|Uncheck|Check|Check|Check|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|Rani|4644585|wen|99 Years|Female|Doctor manonmaniam|Check|Check|Check|Check|


