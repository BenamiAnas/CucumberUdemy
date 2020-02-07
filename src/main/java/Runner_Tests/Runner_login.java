package Runner_Tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"E:\\Projets back end Intelij\\Udemy_Cucumber\\src\\main\\java\\Features"},
        glue = {"Step_Definitions"},
        monochrome = true,
        plugin = {"pretty","html:target.test_login","com.cucumber.listener.ExtentCucumberFormatter:target/report.html"},//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:output/report.html"
        dryRun = false,
        tags = {"@Groupe"}
)
public class Runner_login extends AbstractTestNGCucumberTests {
}
