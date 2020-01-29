package demo1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(plugin={"json:target/cucumber.json"},
		//features="Feature12"
		//,glue= {"step_Definition"})

public class Testrunner {

}
