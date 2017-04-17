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
    Login login = new Login(driver);
    HomePage homePage;
 
    
    @BeforeClass
    public void setup(){

     System.setProperty("webdriver.chrome.driver", "C:\\Users\\gunesh.kumar\\chromedriver_win32\\chromedriver.exe");
   	 driver = new ChromeDriver();
   	 driver.get("http://shop.thepicfactory.com/");
   	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    
    @Test(priority=1)

    public void testLogin(){
    	login = new Login(driver);
    	login.clickLogin();
    	login.Register();
    	login.loginTo("guneshtorres@gmail.com", "torres@f9");
    	System.out.println("deallll");
    	login.profDropDown();
    	System.out.println("atleast drop down");
    //	driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
    	login.deals();
    	System.out.println("deallllddddddddddd");
    }
    
    @Test(priority=2)
    public void testProfile()
    {	
    	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	login.deals();
    	login.profDropDown();
    	System.out.println("deallll");
    	login.myProfile();
    	
    }
    
    /*@Test(priority=3)
    public void testOrders()
    {	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	login.myOrders();
    	
    }
    
    @Test(priority=4)
    public void testLogout()
    {	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	login.logout();
    	
    }*/
    
}