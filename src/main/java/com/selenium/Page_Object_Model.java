package com.selenium;

import org.openqa.selenium.WebDriver;

public class Page_Object_Model {
	
	public WebDriver driver;
	
	private Login_Page LN;
	
	private Customer_details CD;
	
	private Hotel_Search HS;
	
	private Personal_Details PD;
	
	public Page_Object_Model(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public Login_Page get_instance_LN() {
		if (LN==null) {
			LN= new Login_Page(driver); 
		}
		return LN;
	}
	
	public Customer_details get_instance_CD() {
		if (CD==null) {
			CD=new Customer_details(driver);
		}
		return CD;
	}
	
	public Hotel_Search get_instance_HS() {
		if (HS==null) {
			HS=new Hotel_Search(driver);
		}
		return HS;
	}
	
	public Personal_Details get_instance_PD() {
		if (PD==null) {
			PD=new Personal_Details(driver);
		}
		return PD;
	}

}
