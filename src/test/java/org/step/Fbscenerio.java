package org.step;

import org.base.Baseclass;
import org.sam.Fbpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbscenerio extends Baseclass {
	Fbpojo f;
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchBrowser() ;
		windowMaximize();
	
	}

	@When("User has to hit the facebook url.")
	public void user_has_to_hit_the_facebook_url() {
		launchurl("https://en-gb.facebook.com/");
	}
	@When("User has to pass to pass the data {string} in email field")
	public void user_has_to_pass_to_pass_the_data_in_email_field(String em) {
		Fbpojo f = new Fbpojo();
		passText(em,f.getEmail());
	   
	}

	@When("User has to pass to pass the data {string} in password field")
	public void user_has_to_pass_to_pass_the_data_in_password_field(String pass) {
		f = new Fbpojo();
		passText(pass,f.getPassword());
	  
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		f = new Fbpojo();
		clickBtn(f.getLogin());
	  
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	    System.out.println("close");
	}


}
