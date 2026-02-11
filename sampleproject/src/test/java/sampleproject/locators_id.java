package sampleproject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators_id {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.saucedemo.com/");
	Thread.sleep(1000);
	WebElement usrnm =driver.findElement(By.id("user-name"));
	usrnm.sendKeys("standard_user");
	Thread.sleep(2000);
	WebElement usrnm1 =driver.findElement(By.id("password"));
	usrnm1.sendKeys("secret_sauce");
	Thread.sleep(2000);
	WebElement usrnm2 =driver.findElement(By.id("login-button"));
	usrnm2.click();
	Thread.sleep(2000);
 driver.quit();
	}

}
