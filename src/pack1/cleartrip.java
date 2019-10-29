package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arun\\Desktop\\Software\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.cleartrip.com");

		driver.findElement(By.id("FromTag")).sendKeys("Bangalore");

		driver.findElement(By.id("ToTag")).sendKeys("kochi");

		driver.findElement(By.id("DepartDate")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[.='19']")).click();

		WebElement ele = driver.findElement(By.id("Adults"));

		Select s1=new Select(ele);

		s1.selectByIndex(1);

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("Childrens"));

		Select s2=new Select(ele1);

		s2.selectByIndex(1);

		Thread.sleep(2000);

		driver.findElement(By.id("SearchBtn")).click();

	}

}
