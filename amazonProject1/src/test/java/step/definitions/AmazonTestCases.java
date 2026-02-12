package step.definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log4j2_pkg.log4j2_amazon;

public class AmazonTestCases {
	private static final Logger logger = LogManager.getLogger(log4j2_amazon.class);
	WebDriver driver;
@Given("open  amazon broser")
public void open_amazon_broser() throws InterruptedException {
	
	driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	logger.info("browser is open ");
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Given("go to Orders$return")
public void go_to_orders$return() throws InterruptedException {
	
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]")).click();//orders&return
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	logger.info("it's go&back from orders&returns");
	
	/*driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]")).click();
	Thread.sleep(1000);//orders&returns
	driver.navigate().back();
	Thread.sleep(1000);*/
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("click on fresh title")
public void click_on_fresh_title() throws InterruptedException {
	
driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div[2]/div/ul/li[1]/div/a")).click();//fresh opt

	Thread.sleep(1000); 
      driver.navigate().back();
     Thread.sleep(1000); 
     logger.info("click on fresh&back to page ");
	

}

@Then("click on mobile title")
public void click_on_mobile_title() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div[2]/div/ul/li[6]/div/a")).click();//mobiles opt
	Thread.sleep(2000); 
	logger.info("open mibiles ");
	
}

@Then("click on camera option")
public void click_on_camera_option() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[6]/div[1]/ul/li[6]/div/a/span")).click();
	Thread.sleep(1000);//camera opt
	logger.info("open cameras ");
	
	driver.findElement(By.id("nav-search-submit-button")).click(); //search 
  driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("canon camera lens" + Keys.ENTER);
	Thread.sleep(1000);
	
	logger.info("search completed ");
	
 driver.navigate().refresh();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[3]/div/div/div/div[2]/div/form/div/div/span/div/span/span/button")).click();
	    //add to cart1 
	 Thread.sleep(1000);
	 logger.info("successfully add1 ");
		
	 
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[3]/div/div/div/div[2]/div/form/div/div/span/div/span/span/button")).click();
	 Thread.sleep(1000);//add to cart2
	 
	 logger.info("osuccessfully add2 ");
		
	 driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")).click();
	 Thread.sleep(1000);//go to cart
	 logger.info("go to cart done");
		
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div/form/ul/div[3]/div[4]/div/div[2]/div[1]/span[1]/span[1]/fieldset/div[2]/div/button[2]/span")).click();
	 Thread.sleep(1000);//increace
	 logger.info("increase is working");
		 
	
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[1]/div[1]/span/div/label/span")).click();
	 Thread.sleep(1000);//checkbox gift
	 
	 logger.info("gift box ok");
		
	 driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[1]/span[1]/span/span/span/input")).click();
	 Thread.sleep(1000);//buy
	 
	 logger.info("going to buy");
		
	 
	 driver.findElement(By.id("ap_email_login")).click();
	 driver.findElement(By.id("ap_email_login")).sendKeys("vijjukandrathi@gmail.com" + Keys.ENTER);
	 Thread.sleep(1000);
	 logger.info("trying to login");
		
	 driver.quit();
	 logger.info("all cases done");
	 
	}
@Given("search page")
public void search_page() throws InterruptedException {
	//driver.findElement(By.id("nav-search-submit-button")).click();
	//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("canon camera lens" + Keys.ENTER);
	
	//Thread.sleep(2000);
	//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Given("search canon camera lens")
public void search_canon_camera_lens() {
	
	//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[3]/div/div/div/div[2]/div/form/div/div/span/div/span/span/button")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("add to cart1")
public void add_to_cart1() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Then("add to cart2")
public void add_to_cart2() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Then("go to cart")
public void go_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

  
}
