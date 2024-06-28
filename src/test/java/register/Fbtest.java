package register;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/register.feature",glue="register",monochrome=true,dryRun=false,plugin= {"html:report",
"junit:report\\junitreport.xml",
"json:report\\jsonreport.json"}
)

public class Fbtest {

}
