package DriverFactory.StepDef;

import DriverFactory.utils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class MasterHooks extends DriverFactory {

    @Before
    public void setup(){
        driver=getDriver();
    }

   @After
    public void tearDownAndScreenShotFailer(Scenario scenario){
        try {
            if (driver!=null && scenario.isFailed()){
                scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
                driver.manage().deleteAllCookies();
                driver.quit();
                driver=null;
            }if (driver!=null){
                driver.manage().deleteAllCookies();
                driver.quit();
                driver=null;
            }

        }catch (Exception e){
   System.out.println("Methode tearDownAndScreenShotFailer Faild" +e.getMessage());
        }
    }
}
