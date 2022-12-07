package setup;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features="src/test/java/features",glue="setup",plugin= {"html:reports"},
tags= {"@WIP"})
public class RunnerFile extends AbstractTestNGCucumberTests {
	
	

}
