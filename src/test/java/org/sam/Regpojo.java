package org.sam;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Regpojo extends Baseclass {
	public Regpojo () {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement Createaccount;
	@FindBy(name="firstname")
	private WebElement firstName;
	@FindBy(name="lastname")
	private WebElement lastName;
	@FindBy(name="reg_email__")
	private WebElement mobileText;
	@FindBy(name="reg_passwd__")
	private WebElement passText;
	public WebElement getCreateaccount() {
		return Createaccount;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getMobileText() {
		return mobileText;
	}
	public WebElement getPassText() {
		return passText;
	}

}
