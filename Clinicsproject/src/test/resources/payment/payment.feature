Feature: Test the payment page in clinics

@payment
Scenario Outline: Test the payment in registration room

Given select the browser as <Browser>
And enter the url as <Url>
But give the user name as <User>
When give the password as <Pass>
Then click to login button
And click to payment tab in registration
But click to pending payment link in payment
When enter the Patient ID or Contact NO as <Patid> in search filter
And which payment would like to pay as <payment>
Then click to save button

Examples:
|Browser|Url|User|Pass|Patid|payment|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|pellu052|All payment|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|pellu053|All payment|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|pellu054|All payment|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|pellu055|All payment|