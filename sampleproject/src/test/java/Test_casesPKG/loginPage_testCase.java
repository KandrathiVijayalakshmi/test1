package Test_casesPKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages_pkg.Login_page;

public class loginPage_testCase {
	 public static void main (String [] args) {
		 WebDriver driver ;
		 Login_page loginpage;
		 driver=new ChromeDriver();
		loginpage=new Login_page(driver);
		 loginpage.navigateTo();
		 loginpage.login("standard_user","secret_sauce");
		 
		// loginpage.navigateTo();
		 //loginpage.login("invalidusername","wrongpassword");
	 }
}
