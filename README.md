[![Testvagrant.jpg](https://i.postimg.cc/fyzxV31d/Testvagrant.jpg)](https://postimg.cc/Pp7LcqXf)
[![Testvagrant.png](https://i.postimg.cc/y8dvfGQR/Testvagrant.png)](https://postimg.cc/F7MyzTQF)

:seedling: This is just a basic framework under development for automating REST APIs .  `Maven` `Java` `TestNG` `RestAssured` `ExtentReports`.    

Designed specifically for `TestVagrant` project.

**Pre-requisites**: `Maven` and `Java` should be installed in the machine if you are running tests locally.

 

**How to run test locally**  :desktop_computer:   

1. Go to the project root folder where `pom.xml` file is present.
2. Open terminal/CMD in this folder.
3. Run command **mvn clean install**

the test suite execution will start and you can see the execution report under **test-result** folder that will be generated after run (refresh project folder if you don't see it).


**How to run test using github actions**    :rocket:   

I have created a github workflow for this project to run the tests    

On this repository   
1. Go to Actions tab in this repository
2. Click on workflow `TestVagrant API Automation`
3. Click on `Run workflow` dropdown 
4. Click on green `Run workflow` button   

Refresh the browser and you can see that run has been started. Check logs of the tests by going inside this running workflow.   
You can also download the `test-result` folder present inside `Artifacts` block in last github workflow run summary and see the extent HTML report.   

It looks like this:

[![Extent-Report-Demo.png](https://i.postimg.cc/cJT3V1v4/Extent-Report-Demo.png)](https://postimg.cc/sBQ1WrPt)   
[![Test-Report-Demo.png](https://i.postimg.cc/TY9WyYcj/Test-Report-Demo.png)](https://postimg.cc/Whd4CVCt)

Cheers :shipit: :tada:   
