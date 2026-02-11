package CSS_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover_samp {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement obj=driver.findElement(By.linkText("Images"));
		Thread.sleep(2000);
		Actions A1=new Actions(driver);
		A1.moveToElement(obj).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
