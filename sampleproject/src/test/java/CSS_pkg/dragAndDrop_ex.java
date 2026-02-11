package CSS_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop_ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(3000);
	WebElement From =driver.findElement(By.xpath("//*[@id='credit2']/a"));
			WebElement To =driver.findElement(By.xpath("//*[@id='bank']/li"));

	Actions act=new Actions(driver);
	
	act.dragAndDrop(From,To).build().perform(); 
	
	driver.quit();
	

}
}
