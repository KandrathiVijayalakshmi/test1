package CSS_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class image_link {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.google.com/");
	Thread.sleep(2000);driver.findElement(By.linkText("Images")).click();
	Actions a =new Actions(driver);
	a.moveToElement(null).build().perform();
	driver.quit();
	}

}
