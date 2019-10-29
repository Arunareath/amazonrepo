package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbmonthrev {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arun\\Desktop\\Software\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.fb.com");
		
		WebElement ele = driver.findElement(By.id("month"));
		
		ArrayList<String> f1=new ArrayList<String>();;
		
		Select s1=new Select(ele);
		
		List<WebElement> opt = s1.getOptions();
		
		for(WebElement we:opt)
		{
			f1.add(we.getText());
		}
		
		Collections.reverse(f1) ;
		
		for(String str:f1)
		{
			System.out.println(str);
			
		}

	}

}
