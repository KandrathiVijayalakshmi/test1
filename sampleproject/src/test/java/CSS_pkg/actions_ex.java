package CSS_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_ex {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	WebElement obj =driver.findElement(By.name("q"));
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.moveToElement(obj).click();
	a.keyDown(Keys.SHIFT);
	a.sendKeys("TCS").keyUp(Keys.SHIFT).build().perform();
	Thread.sleep(2000);
	a.contextClick().perform();  //right click
	Thread.sleep(2000);
	driver.quit();
	

}
}