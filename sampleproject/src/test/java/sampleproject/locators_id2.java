package sampleproject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators_id2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.saucedemo.com/");
	Thread.sleep(2000);
	WebElement password =driver.findElement(By.id("user-name"));
	password.sendKeys("stander_user");
	}

}


