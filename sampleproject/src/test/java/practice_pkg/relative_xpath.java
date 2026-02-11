package practice_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_xpath {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-pid='2']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
