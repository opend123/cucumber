package register;
import io.cucumber.datatable.*;

import java.util.List;

import org.base.Baseclass;
import org.sam.Regpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbregister  extends Baseclass{
	Regpojo f;
	@Given("To open the browser and maximize the window")
	public void to_open_the_browser_and_maximize_the_window() {
		launchBrowser() ;
		windowMaximize();
	}

	@When("To launch the url of fb")
	public void to_launch_the_url_of_fb() {
		launchurl("https://en-gb.facebook.com/");
	}

	@When("TO click the create new account button")
	public void to_click_the_create_new_account_button() {
	    f = new Regpojo();
	    clickBtn(f.getCreateaccount());
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l=d.asList();
		  f = new Regpojo();
		  passText(l.get(2),f.getFirstName());
		  
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
		  f = new Regpojo();
		  passText("pravee",f.getLastName());
	}

	@When("To pass mobile or email in email text box")
	public void to_pass_mobile_or_email_in_email_text_box(DataTable d) {
		List<List<String>> l=d.asLists();
		  f = new Regpojo();
		  passText(l.get(1).get(2),f.getMobileText());
		  
	}
	@When("To craete new password in password fiels")
	public void to_craete_new_password_in_password_fiels() {
		  f = new Regpojo();
		  passText("pyhrji",f.getPassText());
		  
	    
	}
	@Then("To close the browser")
	public void to_close_the_browser() {
		System.out.println("close");
	}
	

}
