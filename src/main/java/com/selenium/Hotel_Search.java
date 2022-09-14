package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Search {
	
	public WebDriver driver;
	
	public Hotel_Search (WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name=\\\"radiobutton_0\\\"]")
	private WebElement radiobutton;
	
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	@FindBy(xpath = "//input[@name=\\\"continue\\\"]")
	private WebElement Continue;

	public WebElement getContinue() {
		return Continue;
	}

	
	
	
	
	

}
