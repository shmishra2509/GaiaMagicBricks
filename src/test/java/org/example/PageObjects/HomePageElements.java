package org.example.PageObjects;

import org.openqa.selenium.By;

public class HomePageElements
{
    public static final By LOCATION_INPUT      = By.xpath("//input[@id='keyword']");
    public static final By SUBMIT_BUTTON       = By.xpath("//div[@class='mb-search__btn']");
	public static final By PROPERTY_PRICES     = By.xpath("//span[@class='css-1e28vvi-StyledPriceContainer e2uk8e14']");
    public static final By FIFTH_PROPERTY_LINK = By.xpath("(//a[@class='e2uk8e9 css-r83v26-StyledLink-Link-FullCardLink e33dvwd0'])[5]");
    public static final By ENTER_NAME          = By.xpath("//input[@id='userName']");
    public static final By ENTER_EMAIL         = By.xpath("//input[@id='userEmail']");
    public static final By ENTER_PHNO          = By.xpath("//input[@id='userMobile']");
    public static final By GET_CONTACT_DETAILS = By.xpath("//button[normalize-space()='Get Contact Details']");   
}          