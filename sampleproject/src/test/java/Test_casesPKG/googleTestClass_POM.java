package Test_casesPKG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages_pkg.googleSearch_page;

public class googleTestClass_POM {
	static WebDriver driver;
	public static void main(String[] args) {
		googlesearch();
		//driver.quit();
	}
	public static void googlesearch()
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		googleSearch_page.textbox_seach(driver).sendKeys("India");
		googleSearch_page.textbox_seach(driver).sendKeys(Keys.ENTER);
		
	}

}
