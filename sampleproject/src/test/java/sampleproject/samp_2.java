package sampleproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class samp_2 {
	

		public static void main(String[] args) throws InterruptedException{
			// TODO Auto-generated method stub
			System.out.println("Hello and welcome!tcs");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tcs.com");
			Thread.sleep(2000);
			String pagetitle=driver.getTitle();
			System.out.println(pagetitle);
			driver.quit();
		}
}

