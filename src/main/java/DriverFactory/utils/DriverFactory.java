package DriverFactory.utils;

import POM.PageClasses.Guru99HomePage;
import POM.PageClasses.Guru99Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public WebDriver getDriver(){
    try{
        //Read config
      //  ReadConfigFile file =new ReadConfigFile();
        //String browserName= file.getBrowser();      Cette méthode ca marche pas avec l'integration avec Jenkins
// Remplace ce script par :
        Properties prop= new Properties();
        InputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
        prop.load(fi);
        String browserName = prop.getProperty("browserName");
        switch (browserName){
            case "FIREFOX" :
                if (driver==null){
                    System.setProperty("webdriver.gecko.driver",Constant.GECKO_DRIVER_DIRECTORY);
                    DesiredCapabilities capabilities= DesiredCapabilities.firefox();
                    capabilities.setCapability("marionette",true);
                    driver=new FirefoxDriver();
                    driver.manage().window().maximize();
                }
                break;
            case "CHROME":
                //code
                if (driver == null){
                    System.setProperty("webdriver.chrome.driver",Constant.CHROME_DRIVER_DIRECTORY);
                    driver =new ChromeDriver();
                    driver.manage().window().maximize();
                }
                break;
            case "IE":
                //code
                if (driver==null){
                    DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                    System.setProperty("webdriver.ie.driver",Constant.IE_DRIVER_DIRECTORY);
                    capabilities.setCapability("ignoreZoomsetting",true);
                    driver=new InternetExplorerDriver(capabilities);
                    driver.manage().window().maximize();
                }
                break;
        }
    }catch(Exception e){
    System.out.println("unable to load browser: "+e.getMessage());}
    finally{
    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    //Initialisation des SubPages :
        //ClassNameSubPage subpage= PageFactory.initialElements(driver,subpage.class);
        Guru99HomePage homePage= PageFactory.initElements(driver,Guru99HomePage.class);
        Guru99Login loginPage=PageFactory.initElements(driver,Guru99Login.class);
    }
    return driver;
    }
}
