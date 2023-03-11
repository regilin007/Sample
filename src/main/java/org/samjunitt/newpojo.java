package org.samjunitt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newpojo extends baseClass  {

	
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getNext1() {
		return next1;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getNext2() {
		return next2;
	}
	public newpojo() {
		PageFactory.initElements(page, this);
	}
    @FindBy(id = "identifierId")
    private WebElement email;
    @FindBy(xpath = "(//span[@jsname='V67aGc'])[2]")
    private WebElement next1;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[2]")
    private WebElement next2;
}
