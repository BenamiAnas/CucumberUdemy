package Step_Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Login_groupe {
    WebDriver driver;
    @Given("^Im in the home page \"(.*)\"$")
    public void im_in_the_home_page(String url) throws Throwable {
        System.setProperty("webdriver.chrome.driver","E:\\Toshiba\\Selenuim_Drivers\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
    }

    @Given("^I click the login button$")
    public void i_click_the_login_button() throws Throwable {
        driver.findElement(By.id("login-portal")).click();
    }

    @Given("^I enter my \"(.*)\" username$")
    public void i_enter_their_webdriver_username(String username) throws Throwable {
        @SuppressWarnings("unused")
        String winHandleBefore=driver.getWindowHandle();
        for (String winHandl: driver.getWindowHandles()){
            driver.switchTo().window(winHandl);
        }
        driver.findElement(By.id("text")).sendKeys(username);

    }

    @Given("^I enter my\"(.*)\" password$")
    public void i_enter_their_webdriver_password(String password) throws Throwable {
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @Then("^I enter the submite button$")
    public void i_enter_the_submite_button() throws Throwable {
        driver.findElement(By.id("login-button")).click();
        Alert alert = driver.switchTo().alert();
        driver.switchTo().alert().accept();
        driver.close();
        driver.quit();
    }



}
