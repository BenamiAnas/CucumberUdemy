package Step_Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Step_definition_login {
 WebDriver driver;

    @Given("^User navigates into a webdriveruniversity website$")
    public void user_navigates_into_a_webdriveruniversity_website()  {
   System.setProperty("webdriver.chrome.driver","E:\\Toshiba\\Selenuim_Drivers\\chromedriver_win32\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("http://webdriveruniversity.com/");
    }

    @Given("^User click LOGIN PORTAL$")
    public void user_click_LOGIN_PORTAL() {
        driver.findElement(By.id("login-portal")).click();
    }

    @Given("^User enter a correct username$")
    public void user_enter_a_correct_username() {
        @SuppressWarnings("unused")
 String winHandleBefore=driver.getWindowHandle();
 for (String winHandl: driver.getWindowHandles()){
     driver.switchTo().window(winHandl);
 }
        driver.findElement(By.id("text")).sendKeys("Anas");
    }

    @Given("^User enter a \"([^\"]*)\" password$")
    public void user_enter_a_password(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Then("^User click the button Submit$")
    public void user_click_the_button_Submit()  {
        driver.findElement(By.id("login-button")).click();
        driver.switchTo().alert().accept();
        driver.close();
        driver.quit();
        System.out.println("finish");
    }

}
