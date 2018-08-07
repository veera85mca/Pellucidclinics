Feature: Test the worklist coloumn in registration room

@regassign
Scenario Outline: Test the task of Patient assign to the next room
Given select the reg browser as <Browser>
When give the reg url as <Url>
And enter the reg user as <User>
But enter the reg pass as <Pass>
Then click to signin
When click to worklist coloumn
And click the link of search filter
Then give the patient id as <Patid>
But click the assign image icon for this patient
Then assign the patient to the next room

Examples:
|Browser|Url|User|Pass|Patid|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|pellu032|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|auto10501-63|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|auto10501-64|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|auto10501-69|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|auto10501-71|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|auto10501-72|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|auto10501-73|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|auto10501-77|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|auto10501-78|
|Chrome|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|auto10501-79|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@reg.in|password|pellu047|
   