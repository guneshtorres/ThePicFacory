package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    

    public HomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    

    //Get the User name from Home Page
    @FindBy(how=How.XPATH, using="before_login_a")
    WebElement homepage;
    public void getHomePageDashboardUserName(){

        	homepage.getText();

        }

}