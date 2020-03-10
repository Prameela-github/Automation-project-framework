package Runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resorces/feature/Testcase.feature",

tags = { "@tc02" }, 
glue = { "Steps" }, 
monochrome = true)
public class Search_Runner {

}
