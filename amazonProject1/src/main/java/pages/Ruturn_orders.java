package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ruturn_orders {
	
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver =new ChromeDriver();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]")).click();//orders&return
		Thread.sleep(1000);
		driver.navigate().back();
		
		
	}
}
