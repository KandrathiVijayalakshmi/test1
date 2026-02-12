package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open {
	 private WebDriver driver;
	public static void main(String[] args) throws InterruptedException{

		System.out.println("Hello and welcome to Amazon");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//this line is optional
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
	
		
	}

}
