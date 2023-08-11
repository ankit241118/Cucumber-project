package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "src\\test\\java\\feature",
glue = "stepdefination",tags = "@para")

public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {

}
