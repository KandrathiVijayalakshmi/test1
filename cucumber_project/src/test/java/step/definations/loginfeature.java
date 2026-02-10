package step.definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginfeature {
	WebDriver driver;



@Given("browser is on open")
public void browser_is_on_open() {
	driver =new ChromeDriver();
	driver.manage().window().maximize();
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("users on login page")
public void users_on_login_page() {
	driver.navigate().to("http://www.saucedemo.com/");
    // Write code here that turns the phrase above into concrete actions
   
}

@When("^enters(.*)and (.*)$")
public void enter_username_and_password(String username,String password) throws InterruptedException {
	driver.findElement(By.id("user-name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	Thread.sleep(2000);
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("click on login button")
public void click_on_login_button() {
	driver.findElement(By.id("login-button")).click();
    // Write code here that turns the phrase above into concrete actions
   
}


	}




