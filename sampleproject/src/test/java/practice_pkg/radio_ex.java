package practice_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_ex {
	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		driver.findElement(By.id("vfb-7-1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vfb-7-2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vfb-7-3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vfb-6-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vfb-6-1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vfb-6-2")).click();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
