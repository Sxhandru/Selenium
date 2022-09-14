package Test_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="D:\\selenium\\Featurefile\\FeatureFile",
       
		glue="stepDefinitions",
		
		plugin = {"html:Cucumber_Report\\Rep.html", 
				"pretty",
				"json:target/cucumber.json"}
		)
		
		


public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() {
		driver= Base_Class.browser_Configuration("chrome");
	}
	
	
    
	@AfterClass
	public static void tear_Down() {
		driver.quit();
	}
	
}
