package sampleproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_Name {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("welcome");//optional
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.google.com/"); // we can use navigate.to in the place of get
	Thread.sleep(1000);
	WebElement obj =driver.findElement(By.name("q"));//q is search bar here
	Thread.sleep(1000);
	obj.sendKeys("India"); //it means type India
	Thread.sleep(2000);
	obj.sendKeys(Keys.ENTER); //means search for it
	Thread.sleep(2000);
	driver.quit();
	}

}


