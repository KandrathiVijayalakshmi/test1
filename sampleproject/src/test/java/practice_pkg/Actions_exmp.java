package practice_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_exmp {
	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com/");
		Thread.sleep(2000);
		WebElement obj=driver.findElement(By.name("q"));
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.moveToElement(obj).click();
		Thread.sleep(1000);
		a.keyDown(Keys.SHIFT);
		a.sendKeys("hindu ocean").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		a.contextClick().perform();
		Thread.sleep(2000);
	
		driver.quit();
		
	}

}
