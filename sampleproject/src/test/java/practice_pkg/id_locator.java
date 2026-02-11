package practice_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_locator {
	public static void main (String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");
		Thread.sleep(2000);
		WebElement obj=driver.findElement(By.id("user-name"));
		obj.sendKeys("problem_user");
		Thread.sleep(1000);
		WebElement obj1=driver.findElement(By.id("password"));
		obj1.sendKeys("secret_sauce");
		Thread.sleep(1000);
		WebElement obj2=driver.findElement(By.id("login-button"));
		obj2.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
