package step.definations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@SuppressWarnings("deprecation")
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/Feature/login.feature",glue= {"step.definations"},
			monochrome=true,
			plugin= {"pretty","html:target/HtmlReports.html",
					"json:target/JSONReports.xml"}
			)
	public class Test_Runner extends AbstractTestNGCucumberTests{
}
