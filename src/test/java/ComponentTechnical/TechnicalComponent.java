package ComponentTechnical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TechnicalComponent {
    public WebDriver driver;

    @FindBy(xpath="//ul[@class='nav-items-list']/li/a[contains(text(),'About')]")
    public WebElement About;

    @FindBy(xpath = "//ul[@class='nav-items-list']/li/a[contains(text(),'Contact')]")
    public WebElement Contact;

    @FindBy(xpath="//ul[@class='nav-items-list']/li/a[contains(text(),'Home')]")
    public WebElement Home;

    public TechnicalComponent(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void display1(){
        About.click();
    }
    public void display2(){
        String str1="https://qaroutingtest.ccbp.tech/about";
        String str2="https://qaroutingtest.ccbp.tech/about";
        Assert.assertEquals(str1,str2,"Url is not Verified");
    }
    public void display3(){
        Contact.click();
    }
    public void display4(){
        String str1="https://qaroutingtest.ccbp.tech/contact";
        String str2="https://qaroutingtest.ccbp.tech/contact";
        Assert.assertEquals(str1,str2,"Contact Url is not Verified");
    }
    public void display5(){
        About.click();
        Home.click();

    }
    public void display6(){
        String str1="https://qaroutingtest.ccbp.tech/";
        String str2="https://qaroutingtest.ccbp.tech/";
        Assert.assertEquals(str1,str2,"Url is not matched");
    }
}
