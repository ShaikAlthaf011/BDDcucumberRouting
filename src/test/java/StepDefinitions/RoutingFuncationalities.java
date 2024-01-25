package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ComponentTechnical.TechnicalComponent;
public class RoutingFuncationalities {

    public WebDriver driver;
    TechnicalComponent technicalComponent;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Given("I am login to the apllication")
    public void i_am_login_to_the_apllication() {
       driver.navigate().to("https://qaroutingtest.ccbp.tech/");
       driver.manage().window().maximize();
       technicalComponent=new TechnicalComponent(driver);
    }

    @When("I am Click the Navbar application")
    public void i_am_click_the_navbar_application() {
       technicalComponent.display1();
    }

    @Then("I verify the Url")
    public void i_verify_the_url() {
       technicalComponent.display2();
    }

    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }
    @When("I am click contact")
    public void i_am_click_contact() {
        technicalComponent.display3();
    }

    @Then("I Verify the contact url")
    public void i_verify_the_contact_url() {
        technicalComponent.display4();
    }

    @When("I am about and Home")
    public void i_am_about_and_home() {
     technicalComponent.display5();
    }

    @Then("I am verify the Url")
    public void i_am_verify_the_url() {
     technicalComponent.display6();
    }

}
