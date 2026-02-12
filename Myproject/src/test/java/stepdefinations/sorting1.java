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
    driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in");
	Thread.sleep(1000);
}		

@Given("go to sorting option and dropdown")
public void go_to_sorting_option_and_dropdown() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]")).click();//orders&return
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	//System.out.println("sorting success");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
@When("select low to high option")
public void select_low_to_high_option() throws InterruptedException {
	
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div[2]/div/ul/li[1]/div/a")).click();//fresh opt
	

	Thread.sleep(1000); 
      driver.navigate().back();
     Thread.sleep(1000); 
	
}

@Then("back to search")
public void back_to_search() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div[2]/div/ul/li[6]/div/a")).click();//mobiles opt
	Thread.sleep(2000); 
	
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[6]/div[1]/ul/li[6]/div/a/span")).click();
	Thread.sleep(2000);//camera opt
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/ul/li/span/a/div/label/i")).click();
	Thread.sleep(2000);//amazon check box
	
	driver.navigate().refresh();
	
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div[3]/div[5]/div/div/div/div[2]/div/form/div/div/span/div/span/span/button")).click();
	Thread.sleep(2000);//add to cart1
	
	//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/span/div/div/div[3]/div[5]/div/div/div/div[2]/div/form/div/div/span/div/span/span/button")).click();
	//Thread.sleep(2000);//add to cart2
	
	driver.findElement(By.id("a-autoid-3-announce")).click();
	Thread.sleep(2000);//add to cart 2
	
	//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")).click();
	//Thread.sleep(2000);//goto cart
	
	driver.findElement(By.id("nav-cart")).click();
	Thread.sleep(2000);//goto cart

	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div/form/ul/div[3]/div[4]/div/div[2]/ul/div[2]/li[3]/span/span/div/label/i")).click();
Thread.sleep(2000);//check box gift
	System.out.println("back to sorting search");
	driver.quit()
;    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}


}
