package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Minimise {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Arun\\Desktop\\Software\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
	    driver.get("https://www.seleniumhq.org/");
		
		//WebElement ele = driver.findElement(By.xpath("//a[.='Browser Automation']"));
		
		//Actions act=new Actions(driver);
		
		//act.contextClick(ele).perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ALT);
		
		r.keyPress(KeyEvent.VK_SPACE);
		
		r.keyPress(KeyEvent.VK_N);
		
		

	}



}
