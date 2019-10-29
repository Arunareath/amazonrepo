package Testpack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/Arun/Desktop/Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 
		 
		 File dst = new File("F://screenshot//sample.jpg");
		 
		 FileUtils.copyFile(src, dst);
	}

}
