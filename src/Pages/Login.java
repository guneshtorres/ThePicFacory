package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(how=How.XPATH, using="//input[@type='email']")
    WebElement email;
    
    public void setUserName(String strUserName){
    	email.sendKeys(strUserName);    
    }
    
    @FindBy(how=How.XPATH, using="//input[@type='password']")
    WebElement password;
    public void setPassword(String strPassword){
    	password.sendKeys(strPassword);
    }

    

    @FindBy(how=How.XPATH, using="//input[@type='submit']")
    WebElement submit;// = driver.findElement(By.xpath("//input[@type='submit']"));
    public void clickSignIn(){

    	submit.click();

    }
    
  //  @FindBy(how=How.XPATH, using="//input[@type='submit']")
    public void clickLogin(){
    	
        WebElement login = driver.findElement(By.className("before_login_a"));
        login.click();
    }
    
    //Get the title of Login Page

    /*public String getLoginTitle(){

     return    driver.findElement(titleText).getText();

    }*/

    

    public void loginTo(String strUserName, String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickSignIn();        

        

    }

}