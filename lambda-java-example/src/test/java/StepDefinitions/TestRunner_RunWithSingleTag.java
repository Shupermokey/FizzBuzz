package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Alex
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/FeatureWithTags",
glue= {"StepDefinitions"},
tags= {"@regression,@smoke"})

public class TestRunner_RunWithSingleTag {

}
