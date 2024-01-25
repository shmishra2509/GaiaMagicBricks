package org.example.TestCases;

import org.example.PageObjects.HomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HomePageActions {

    private final WebDriver driver;

    public HomePageActions(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage(String url) {
        driver.get(url);
    }

    public void enterLocationAndSubmit(String location) {
        driver.findElement(HomePageElements.LOCATION_INPUT).sendKeys(location);
        driver.findElement(HomePageElements.SUBMIT_BUTTON).click();
    }


    public void getAllPropertyPrices() {
        // Assuming you already have a WebDriver instance and it is initialized.

        // Navigate to the MagicBrick homepage
        driver.get("https://www.magicbricks.com/property-for-sale/residential-real-estate?bedroom=2,3&proptype=Multistorey-Apartment,Builder-Floor-Apartment,Penthouse,Studio-Apartment,Residential-House,Villa&cityName=Mumbai");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='mb-srp__card__price--amount']"));

        ArrayList<String> arrList = new ArrayList<String>();
        ArrayList<String> crList = new ArrayList<String>();       
        ArrayList<String> lacList = new ArrayList<String>();
        System.out.println("All prices "+ priceElements.size());
      
      for(WebElement e: priceElements)
      {
    	  if (e.getText().contains("Cr")) {
			crList.add(e.getText());
		}else {
			lacList.add(e.getText());
			}
//      	System.out.println(e.getText());
      }
      
//      Collections.sort(arrList, Collections.reverseOrder());
//      for(String e: arrList)
//      {
//      
//      	System.out.println(e);
//      }
      Collections.sort(crList, Collections.reverseOrder());
      Collections.sort(lacList, Collections.reverseOrder());
      arrList.addAll(crList);
      arrList.addAll(lacList);
      for(String e: arrList)
        {
        	System.out.println(e);
        }
    }
    
    public void clickFifthProperty() {
         
    	driver.findElement(By.xpath("//div[@class='mb-srp__list'][5]")).click();
    }
    
    public void clickContactBuilder() {
    	
    	driver.findElement(By.xpath("//a[@class='mb-ldp__action--btn large btn-red']")).click();
    }
    
    public void fillForm() throws InterruptedException {
    	Thread.sleep(1500);

    	driver.findElement(HomePageElements.ENTER_NAME).sendKeys("Shivam");
    	Thread.sleep(1500);
    	driver.findElement(HomePageElements.ENTER_EMAIL).sendKeys("Shivam@gmaoil.com");

    	driver.findElement(HomePageElements.ENTER_PHNO).sendKeys("9"+getRandomNumberString());

    	driver.findElement(HomePageElements.GET_CONTACT_DETAILS).click();;

    }
    
    public static String getRandomNumberString() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        // this will convert any number sequence into 6 character.
        return String.format("%09d", number);
    }
    
    public static long getCurrencyNumericalFormate(String data) {
    	
    	return 0;	
    }
    
}



