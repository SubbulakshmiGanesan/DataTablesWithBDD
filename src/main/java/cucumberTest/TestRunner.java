package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Eclipse\\DataTablesWithBDD\\src\\main\\java\\Feature\\login.feature"
		,glue={"D:\\Eclipse\\DataTablesWithBDD\\src\\main\\java\\stepDefinition\\Test_Steps.java"}
		)

public class TestRunner {

}
