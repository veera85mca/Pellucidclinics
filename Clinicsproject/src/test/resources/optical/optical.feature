Feature: Optical room for Clinincs

@optical
Scenario Outline: Test the optical room for end to end test

Given select the browser as <Browser>
And enter the Url as <Url>
When give the username as <User>
But give the password as <Pass>
Then Click to login button for Optical
When Click to worklist icon
And Click to search filter link for optical
But enter the patientid as <Patientid> in search
When give the appfrom date as <Appfrom>
And give the appto date as <Appto>
Then Click to search button for optical
But click to icon of purchase spectacles
And enter the Spectacle name as <spectacle>
When enter the Frame name as <Frame>
Then enter the Contact lens name as <Contactlens>
And enter the Sunglassess as <Sunglassess>
When enter the other glass as <Others>
But enter the General notes as <General>
Then click to save the information

Examples:
|Browser|Url|User|Pass|Patientid|Appfrom|Appto|spectacle|Frame|Contactlens|Sunglassess|Others|General|
|Firefox|http://192.168.0.199/PellucidClinicsAuto/Home/Index|auto@opt.in|password|pellu056|1-Jul-2018|27-Jul-2018|argenti (150)|swish|italia|Urugua|paraguva|Good|



