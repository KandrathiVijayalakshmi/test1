package CSS_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicityWait_ex {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/dynamic-properties");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	System.out.println(driver.findElement(By.id("visibleAfter")).getText());
	driver.quit();
	
	}
}
