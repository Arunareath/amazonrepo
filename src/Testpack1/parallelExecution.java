package Testpack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parallelExecution {
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arun\\Desktop\\Software\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Arun\\Desktop\\Software\\chromedriver.exe");	
	}
	@Parameters({"browser"})
	@BeforeClass
	public void openapp(String browser) 
	{
		if(browser.equals("firefox"))
		{
		driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		}
		else
		{
			driver=new ChromeDriver();
			driver.get("https://www.gmail.com");
		}
	}
	
		@Test(priority=1)
		public void test1()
		{
			driver.get("https://www.amazon.com");
		}
		@Test(priority=2)
		public void test2()
		{
			driver.get("https://www.flipkart.com");
		}
	
		
      @AfterClass
      public void closeapp()
      {
	   driver.close();
      }
    }
	


