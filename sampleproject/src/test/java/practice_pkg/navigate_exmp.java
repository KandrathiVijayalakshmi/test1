package practice_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_exmp {
	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Images")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(1000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.quit();	
	
	}
}
