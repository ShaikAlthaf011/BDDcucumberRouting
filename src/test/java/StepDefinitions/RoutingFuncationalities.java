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

    @Given("Login navigate to The Application")
    public void login_navigate_to_the_application() {
        driver.navigate().to("https://qaroutingtest.ccbp.tech/");
        driver.manage().window().maximize();
        technicalComponent=new TechnicalComponent(driver);
    }

    @When("Verify  the Navbar about link")
    public void Verify_the_Navbar_about_link() {
       technicalComponent.display1();
    }

    @Then("verify the Url")
    public void verify_the_url() {
       technicalComponent.display2();
    }

    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }
    @When("Verify click on the contact button")
    public void Verify_click_on_the_contact_button() {
        technicalComponent.display3();
    }

    @Then("Verify the contact url")
    public void Verify_the_contact_url() {
        technicalComponent.display4();
    }

    @When("Verify click on the button about and Home")
    public void Verify_click_on_the_button_about_and_Home() {
     technicalComponent.display5();
    }

    @Then("I am verify the Url")
    public void i_am_verify_the_url() {
     technicalComponent.display6();
    }

}
