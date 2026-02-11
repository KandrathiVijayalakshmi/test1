package practice_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_sam {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("welcome");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String pagetitle=driver.getTitle();//optional
		System.out.println(pagetitle);//optional
		driver.quit();
	}

}
