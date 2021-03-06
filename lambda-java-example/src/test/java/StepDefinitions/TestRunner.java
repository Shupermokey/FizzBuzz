package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/LoginDemo.feature",
glue= {"StepDefinitions"},
monochrome = true,
plugin = {"pretty","junit:target/jUnitReports/report.xml",
		  "json:target/JSONReports/report.json",
		  "html:target/HtmlReports/report.html"})
public class TestRunner {

}
