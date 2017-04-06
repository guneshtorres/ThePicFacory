package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.Login;

public class TestClass {

    WebDriver driver;
    Login login;
    HomePage homePage;
    
    @BeforeClass
    public void setup(){

     System.setProperty("webdriver.chrome.driver", "C:\\Users\\gunesh.kumar\\chromedriver_win32\\chromedriver.exe");
   	 driver = new ChromeDriver();
   	 driver.get("http://shop.thepicfactory.com/");
   	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    
    @Test(priority=0)

    public void testLogin(){
try{
    	login = new Login(driver);
    	login.clickLogin();
    	login.loginTo("niki", "idiot");
}catch(Exception e)
{
	e.printStackTrace();
}
    
    homePage = new HomePage(driver);

    
  //Verify home page
  //  Assert.assertTrue(homePage.getHomePageDashboardUserName().contains("manger id : mgr123"));

    }
}