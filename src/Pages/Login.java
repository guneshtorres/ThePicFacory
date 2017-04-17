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
    
    public void Register(){
    	WebElement register = driver.findElement(By.xpath("//div/div[2]/a[contains(text(), 'Register')]"));
    	register.click();
    }
    //Get the title of Login Page

    /*public String getLoginTitle(){

     return    driver.findElement(titleText).getText();

    }*/

    

    public void loginTo(String strUserName, String strPasword){

        this.setUserName(strUserName);
        this.setPassword(strPasword);
        this.clickSignIn();   
    }

  /*  @FindBy(how=How.CSS, using="#\23 > div.col-lg-6.col-md-6.col-sm-6.col-xs-7.inblock > div > div > ul:nth-child(2) > li:nth-child(2) > a > i")
    WebElement drodwn;*/
    public void profDropDown(){
    	WebElement profile = driver.findElement(By.xpath("//i[@class='fa fa-caret-down']"));
    	profile.click();
    }
    
    public void myProfile(){
 
    	WebElement profile = driver.findElement(By.xpath("//a[contains(text(), 'My Profile')]"));
    	profile.click();
    }
    
    public void myOrders(){
    	 
    	WebElement orders = driver.findElement(By.xpath("//a[contains(text(), 'My Orders')]"));
    	orders.click();
    }
    
    public void logout(){
   	 
    	WebElement logout = driver.findElement(By.xpath("//a[contains(text(), 'Logout')]"));
    	logout.click();
    }
    
    public void deals()
    {
    	WebElement deals = driver.findElement(By.className("offers_content"));
    	deals.click();
    }

}