package sampleproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_xpathRelative {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-pid='2']")).click();
	Thread.sleep(2000);
	
 driver.quit();
	}
}
