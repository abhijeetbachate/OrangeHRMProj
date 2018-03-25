set projectLocation=E:\Java Softwares\eclipse\New folder\OrangeHRMProj
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause