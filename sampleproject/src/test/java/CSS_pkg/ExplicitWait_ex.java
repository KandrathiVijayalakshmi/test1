package CSS_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_ex {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/dynamic-properties");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter")));
	
	driver.findElement(By.id("visibleAfter")).click();
driver.quit();
	
	}
}
