package practice_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class name_locator {
	public static void main (String[] args) throws InterruptedException{
		System.out.println("welcome Google");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		WebElement obj=driver.findElement(By.name("q"));
		obj.sendKeys("India");
		Thread.sleep(2000);
		obj.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
