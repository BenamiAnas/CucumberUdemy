package DriverFactory.StepDef;

import DriverFactory.utils.DriverFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Login_Groupe extends DriverFactory {

    @Given("^Im in the home page$")
    public void im_in_the_home_page(DataTable dataTable)  {
        List<List<String>> data= dataTable.raw();
        getDriver().get(data.get(0).get(0));
    }

    @Given("^I click the login button$")
    public void i_click_the_login_button() throws InterruptedException {
        WebElement element = driver.findElement(By.id("login-portal"));
        WebDriverWait wait = new WebDriverWait(driver, 20); //here, wait time is 20 seconds

        wait.until(ExpectedConditions.visibilityOf(element)); //this will wait for elememt to be visible for 20 seconds
       // Thread.sleep(3000); // Attend 3 second Just for The show of Results
        //element.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
    }

    @Given("^I enter my username$")
    public void i_enter_their_webdriver_username(DataTable dataTable) throws Throwable {
        @SuppressWarnings("unused")
        String winHandleBefore=getDriver().getWindowHandle();
        for (String winHandl: getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandl);
        }
        WebElement element = driver.findElement(By.id("text"));
        WebDriverWait wait = new WebDriverWait(driver, 20); //here, wait time is 20 seconds

        wait.until(ExpectedConditions.visibilityOf(element)); //this will wait for elememt to be visible for 20 seconds
        List<List<String>> data= dataTable.raw();
      //  Thread.sleep(3000); // Attend 3 second
        element.sendKeys(data.get(0).get(0));
        //getDriver().findElement(By.id("text")).sendKeys(username);
        Assert.assertEquals(driver.getTitle(),"hello");
    }

    @Given("^I enter my password$")
    public void i_enter_their_webdriver_password(DataTable dataTable) throws Throwable {
        //Thread.sleep(3000); // Attend 3 second
        List<List<String>> data= dataTable.raw();
        getDriver().findElement(By.id("password")).sendKeys(data.get(0).get(0));

    }

    @Then("^I enter the submite button$")
    public void i_enter_the_submite_button() throws Throwable {
       // Thread.sleep(3000); // Attend 3 second
        getDriver().findElement(By.id("login-button")).click();
        getDriver().switchTo().alert().accept();
    }
}
