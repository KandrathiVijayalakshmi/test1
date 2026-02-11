package CSS_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframes_ex {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");
	WebDriver driver =new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/frames");
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Nested Frames")).click();
	Thread.sleep(2000);
	driver.switchTo().frame("frame-bottom");
	Thread.sleep(2000);
	WebElement obj=driver.findElement(By.cssSelector("body"));
	System.out.println("Bottom frame test: " +obj.getText());
	
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	driver.switchTo().frame("frame-top");
	Thread.sleep(2000);

	driver.switchTo().frame(1);
	Thread.sleep(2000);

	WebElement obj1 =driver.findElement(By.id("content"));
	System.out.println(obj1.getText());
	driver.quit();
	
	}
}
