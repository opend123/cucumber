package org.step;

import org.base.Baseclass;
import org.sam.Fbpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblogin extends Baseclass {
	Fbpojo f;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchBrowser() ;
		windowMaximize();
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchurl("https://en-gb.facebook.com/");
	    
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		Fbpojo f = new Fbpojo();
		passText("selenium@gmail.com",f.getEmail());
	   
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		f = new Fbpojo();
		passText("sele",f.getPassword());
	  
	}
	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new Fbpojo();
		clickBtn(f.getLogin());
	  
	}

	@When("To  check whether navigate to the password field")
	public void to_check_whether_navigate_to_the_password_field() {
		System.out.println("to check the page is find");
	   
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeBrowser();
	  
	}




	

	

}
