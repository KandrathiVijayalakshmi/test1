package sampleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstmaven {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("Hello and welcome!google");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//this line is optional
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		driver.quit();
	}

}
