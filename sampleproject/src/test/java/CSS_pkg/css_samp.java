package CSS_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_samp {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input#user-name")).sendKeys("error_user");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input#login-button")).click();
	Thread.sleep(2000);
	driver.quit();
	}
	
}