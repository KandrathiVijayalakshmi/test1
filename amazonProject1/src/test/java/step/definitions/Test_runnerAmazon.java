package step.definitions;

	
	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	//import io.cucumber.te.CucumberOptions;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@SuppressWarnings("deprecation")
		@RunWith(Cucumber.class)
		@CucumberOptions(
				features = "src/test/resources/features",glue= {"step.definitions"},
				monochrome=true,
				plugin= {"pretty","html:target/HtmlReports.html",
						"json:target/JSONReports.xml"}
				)
	public class Test_runnerAmazon extends AbstractTestNGCucumberTests{
	}



