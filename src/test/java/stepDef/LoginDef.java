package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class LoginDef {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() throws InterruptedException {
//        final String dir = System.getProperty("user.dir");
//        System.out.println("current dir = " + dir);
//        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        Thread.sleep(1000);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).isDisplayed();
    }

    @When("I input {string} username")
    public void iInputUsername(String arg0) {
        driver.findElement(By.id("user-name")).sendKeys(arg0);
    }

    @And("I input {string} password")
    public void iInputPassword(String arg1) {
        driver.findElement(By.id("password")).sendKeys(arg1);
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I will get the {string} result")
    public void iWillGetThe(String arg2) {
        driver.findElement(By.xpath("//span[@class = 'title']")).isDisplayed();
    }
}
