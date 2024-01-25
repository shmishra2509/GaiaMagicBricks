package org.example.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TickTick {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivam Mishra\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the desired web page
        driver.get("https://www.magicbricks.com/property-for-sale/residential-real-estate?bedroom=2,3&proptype=Multistorey-Apartment,Builder-Floor-Apartment,Penthouse,Studio-Apartment,Residential-House,Villa&cityName=Mumbai");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Locate elements containing price values
//        List<WebElement> priceElements = new ArrayList<WebElement>();
//        		priceElements = driver.findElements(By.xpath("//div[@class='mb-srp__card__price--amount']"));/
        
        List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='mb-srp__card__price--amount']"));
//        System.out.println(priceElements.size());        
//        Collections.sort(priceElements, Collections.reverseOrder());
        ArrayList<String> arrList = new ArrayList<String>();
        System.out.println("All prices "+ priceElements.size());
        
        for(WebElement e: priceElements)
        {
        	arrList.add(e.getText());
//        	System.out.println(e.getText());
        }
        
        Collections.sort(arrList, Collections.reverseOrder());
        for(String e: arrList)
        {
        
        	System.out.println(e);
        }
        
    }
}
