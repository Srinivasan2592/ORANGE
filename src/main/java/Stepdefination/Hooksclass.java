package Stepdefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Orange_HRM.Baseclass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksclass extends Baseclass {
    
    @Before
    public void beforeScenario(){
    	System.out.println("********** Execution Start *********");
    	
    } 
    @After
    public void tearDown(Scenario scenario) {
    	if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
            System.out.println("**********Screenshoted for failed test case *********");
           }
    	        }  
}