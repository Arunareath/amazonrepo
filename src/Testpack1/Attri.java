package Testpack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/Arun/Desktop/Software/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		
		int count = ele.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement we = ele.get(i);
			
			String url = we.getAttribute("href");
			
			System.out.println(url);
		}
		
	}
	

}
