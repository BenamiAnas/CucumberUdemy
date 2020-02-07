package DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    int SECONDS_TO_WAIT = 10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(SECONDS_TO_WAIT, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, SECONDS_TO_WAIT);
    }

    public WebElement findWebElements(By locator) {
        try {
            return driver.findElement(locator);
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public String verifyTitle() {
        try {
            driver.getTitle();
            return driver.getTitle();
        } catch (NoSuchElementException e) {
            return "Titles aren´t equals";
        }
    }

    public boolean typeOnElement(WebElement element, String text) {
        try {
            waitForElementEnabled(element);
            element.clear();
            element.sendKeys(text);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public String getTextFromElement(WebElement element) {
        try {
            waitForElementVisible(element);
            element.getText();
            return element.getText();
        } catch (NoSuchElementException e) {
            return "Elements are not equals";
        }
    }

    public boolean clickOnElement(WebElement element) {
        try {
            waitForElementEnabled(element);
            element.click();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    //Wait methods
    public boolean waitImplicity() {
        int nroSegundos = 30;
        try {
            driver.manage().timeouts().implicitlyWait(nroSegundos, TimeUnit.SECONDS);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitExplicity() throws InterruptedException {
        try {
            Thread.sleep(2000);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitForElementVisible(WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean waitForElementEnabled(WebElement element)
    {
        try {
            wait.until(ExpectedConditions.elementToBeClickable ((By) element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean waitForElementNotVisible(WebElement element)
    {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated((By) element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //URL & driver methods
    public boolean openUrl() {
        String urlPrincipal = "http://automationpractice.com/index.php";
        try {
            driver.get(urlPrincipal);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean maximizeBrowser() {
        try {
            driver.manage().window().maximize();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean closeDriver() {
        try {
            driver.close();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
