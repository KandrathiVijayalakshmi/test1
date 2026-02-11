package practice_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover_exmp {
	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement obj=driver.findElement(By.linkText("Images"));
		Thread.sleep(1000);
		Actions A=new Actions(driver);
		A.moveToElement(obj).perform();
		Thread.sleep(1000);
		driver.quit();
	}
}
