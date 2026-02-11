package CSS_pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_ex {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	driver.findElement(By.name("cusid")).sendKeys("93911");
	Thread.sleep(2000);
	driver.findElement(By.name("submit")).submit();
	Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();
	//String alertMessage =driver.switchTo().alert().getText();
	System.out.println(alert.getText());
	alert.accept();
	Thread.sleep(2000);
	driver.quit();
	
	}
}
