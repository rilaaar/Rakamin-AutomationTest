package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import stepDef.LoginDef;

public class DashboardDef {

    @Steps
    LoginDef loginDef;

    @Given("I am on login account")
    public void iAmOnLoginAccount() {
        loginDef.driver.get(loginDef.baseUrl);
        loginDef.iInputUsername("standard_user");
        loginDef.iInputPassword("secret_sauce");
    }

    @When("I click sidebar button")
    public void iClickSidebarButton() {
        loginDef.driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    @And("I click about button")
    public void iClickAboutButton() {
        loginDef.driver.findElement(By.id("about_sidebar_link")).click();
    }

    @Then("I will go to about page")
    public void iWillGoToAboutPage() {
        loginDef.driver.findElement(By.xpath("//h2[@class = 'title is-1']")).isDisplayed();
    }

    @And("I click logout button")
    public void iClickLogoutButton() {
        loginDef.driver.findElement(By.id("logout_sidebar_link")).click();
    }

    @Then("I will go to login page")
    public void iWillGoToLoginPage() {
        loginDef.driver.findElement(By.xpath("//div[@class = 'bot_column']")).isDisplayed();
    }

    @When("I click photo product")
    public void iClickPhotoProduct() {
        loginDef.driver.findElement(By.id("item_4_img_link")).click();
    }

    @Then("I will go to product detail page")
    public void iWillGoToProductDetailPage() {
        loginDef.driver.findElement(By.xpath("//div[@class = 'inventory_item_container']")).isDisplayed();
    }

    @When("I click name product")
    public void iClickNameProduct() {
        loginDef.driver.findElement(By.xpath("//div[@class = 'inventory_item_name']")).click();
    }

    @When("I click add to cart button")
    public void iClickAddToCartButton() {
        loginDef.driver.findElement(By.id("shopping_cart_container")).click();
    }

    @Then("I get remove button")
    public void iGetRemoveButton() {
        loginDef.driver.findElement(By.xpath("shopping_cart_container")).isDisplayed();
    }

    @When("I click sort button")
    public void iClickSortButton() {
        loginDef.driver.findElement(By.xpath("//select[@class = 'product_sort_container']")).click();
    }

    @And("I click name")
    public void iClickName() {
        loginDef.driver.findElement(By.xpath("//option[@value ='az']")).click();
    }

    @Then("I get custom list product Az")
    public void iGetCustomListProductAz() {
        loginDef.driver.findElement(By.xpath("//div[@class = 'inventory_item_name']")).isDisplayed();
    }

    @And("I click price")
    public void iClickPrice() {
        loginDef.driver.findElement(By.xpath("//option[@value ='lohi']")).click();
    }

    @Then("I get custom list product Price")
    public void iGetCustomListProductPrice() {
        loginDef.driver.findElement(By.xpath("//div[@class = 'inventory_item_price']")).isDisplayed();
    }

    @When("I click cart button")
    public void iClickCartButton() {
        loginDef.driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']")).click();
    }

    @Then("I will go to my cart page")
    public void iWillGoToMyCartPage() {
        loginDef.driver.findElement(By.xpath("//div[@class = 'header_secondary_container']")).isDisplayed();
    }
}
