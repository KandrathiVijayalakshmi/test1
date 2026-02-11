package pages_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleSearch_page {
	private static WebElement element=null;
	public static WebElement textbox_seach(WebDriver driver) {
		element =driver.findElement(By.name("q"));
		return element;
		
	}
	
		
	}


