package POM.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Guru99HomePage {
    WebDriver driver;

    By homePageUserName = By.xpath("//table//tr[@class='heading3']");

    public Guru99HomePage(WebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory =new AjaxElementLocatorFactory(driver,20); // Si l'élément n'apparaisse pas aprés 20sec d
        PageFactory.initElements(factory, this);
    }
    //Get the User name from Home Page
    public String getHomePageDashboardUserName(){

        return    driver.findElement(homePageUserName).getText();
    }

}
