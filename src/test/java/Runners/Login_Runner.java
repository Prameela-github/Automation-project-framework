package Runners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resorces/feature/Testcase.feature",

tags = { "@tc01" }, 
glue = { "Steps" }, 
monochrome = true)
public class Login_Runner {

}
