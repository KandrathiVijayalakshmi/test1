package CSS_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_Select {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	System.out.println(driver.getTitle());
	WebElement drpdwn =driver.findElement(By.name("country"));
	Select sel= new Select(drpdwn);
	sel.selectByVisibleText("ALBANIA");
	Thread.sleep(2000);
	sel.selectByIndex(4);
	
	
}
}