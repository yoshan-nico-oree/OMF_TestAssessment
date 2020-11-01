# OMF_TestAssessment

Programming Language: Java 

Automation Test Tool/Library Dependency: WebDriver (Selenium latest version)

Build Tool: Java 
-------------------------------------------------------------------------

Git Repo: 
Prject Repo can be found here in GIT: 
https://github.com/yoshan-nico-oree/OMF_TestAssessment.git

Download the code from git and unzip the project to your working directory

-------------------------------------------------------------------------
To execute the java/selenium tests please do the follwowing: 

1. Install Java 
2. Configure Java Path in your system variables 
3. Download Eclipse here: https://www.eclipse.org/downloads/packages/release/2020-09/r/eclipse-ide-java-developers

NB! Dependancy of Eclipse is Java so please download and install Java as a pre-requisite before attempting to run Eclipse in your environment. 

4. You'll notice that the download comes in zip format so extract that folder to unzip all the Eclipse folders 
5. Navigate to the Eclipse folder and invoke the eclipse.exe to effectively run the Eclipse application
6. Import the Project into Eclipse by either: 
    - Importing Prjects from GIT OR
    - Importing the downloaded code from your working directory

-------------------------------------------------------------------------

After you imort the project into Eclipse you will notice the following: 
- Package: OMF_Test_Suite 
- Java Class: OMF_AssessmentTest

Two Test Cases namely; 

- OMF_AssessmentTests: This Test Suite invokes the Chrome Driver to run its tests on
- OMF_AssessmentTestsFirefox: This Test Suite invokes the FireFox driver to run its tests on

Within each of the Test Cases there are 4 test case methods namely; 
- HomePageVerification
- PersonalLoan_Verification
- Calculator_Verification
- TermCapital_Verification

TestNG library was installed to manage test case prioritization and the order in which they are run: 
@Test (priority=4)

When Executing the tests please run them as TestNG Tests

-------------------------------------------------------------------------

Reporting: 

After each test execution navigate to the "test-ouput" folder and open either of the files to view the Test Report: 
- emailable-report.html
- index.html






