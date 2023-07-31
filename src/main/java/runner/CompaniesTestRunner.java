package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\SeleniumWorkSpace\\AFreeCRMBDDFramework\\src\\main\\java\\features\\companies.feature"},//the path of the feature files
		glue={"companiesStepDefinations"},//step Defination Package Name
		plugin = {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome=true,
		dryRun=false
		)
public class CompaniesTestRunner {

}
