package step.definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class backGround {

@Given("User is on HRMLogin page {string}")
public void user_is_on_hrm_login_page(String string) {
	System.out.println("hii");
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enters username as {string} and password as {string}")
public void user_enters_username_as_and_password_as(String string, String string2) {
	System.out.println("vijju");
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user should be able to login successfully and new page opens")
public void user_should_be_able_to_login_successfully_and_new_page_opens() {
	System.out.println("welcome ");
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enters username as {string}")
public void user_enters_username_as(String string) {
	System.out.println("To");
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user should be able to see a message {string} below username")
public void user_should_be_able_to_see_a_message_below_username(String string) {
	System.out.println("TCS");
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



}
