package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\",
glue = "Stepdefination", 
monochrome = true,
plugin = {"pretty","html:target/cucumber-html-reports","json:target/cucumber-html-reports/cucumber.json","json:target/cucumber.xml"},
tags ={"@tag,@tag2,@tag3"})/*this is OR operation which consider either smoker test want to run or 
										Negativetest case want to ignore **/
/*tags ={"@SmokeTest""~@NegativeTest"})   This is AND operation which consider  smoker test want to run and 
										Negativetest case want to ignore **/
public class Testrunner {

}