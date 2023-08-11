package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\feature",
		glue = "stepdefination", plugin = {"pretty","html:target//cucumber.html ","json:target//cucumber.json ","junit:target//cucumberxml.xml "}
		,dryRun = false)
public class JunitestRunener {

}
