package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sorting1 {

WebDriver driver;
@Given("browser is in open")
public void browser_is_in_open() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[6]/div[2]/div/div/ul/li[7]/div/a")).click();//customer service
	//driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button")).click();//continue option
	//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div[2]/div/ul/li[1]/div/a")).click();//fresh opt
	// WebElement obj=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
	//Thread.sleep(1000); 
	//obj.sendKeys("phones" + Keys.ENTER); 
	//Thread.sleep(2000);
	
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/div[2]/div/div/form/div/div[1]/div/input")).click();
	
	//WebElement obj1= driver.findElement(By.xpath("/html/body/div[1]/header/div/div[7]/div/div[2]/div[2]/div[5]/div/a/span"));
	Thread.sleep(1000);
	//obj1.sendKeys("return policy" + Keys.ENTER);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/article/div/div[2]/div/div/div[1]/ul/li[2]/a")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("").click();
	
	
}
	

@Given("go to sorting option and dropdown")
public void go_to_sorting_option_and_dropdown() throws InterruptedException {
	
	System.out.println("sorting success");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
//WebElement drpdwn;
@When("select low to high option")
public void select_low_to_high_option() throws InterruptedException {
     
	driver.findElement(By.id("nav-hamburger-menu")).click();//all option
	
	
	
	//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div[2]/div/ul/li[5]/div/a")).click();
	Thread.sleep(2000);
	
	
	/*Select sel= new Select(drpdwn);
	driver.findElement(By.className("a-dropdown-link")).click();
	Thread.sleep(2000);
	sel.selectByVisibleText("Price: Low to High");
	Thread.sleep(1000);*/

    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("back to search")
public void back_to_search() {
	System.out.println("back to sorting search");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}


}
