package org.example.TestCases;

import java.util.Iterator;
import org.example.PageObjects.HomePageElements;
import org.example.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.sun.tools.classfile.Opcode.Set;

import groovy.time.Duration;

public class MagicBricks {

    public static void main(String[] args) throws InterruptedException {
             
        
       ChromeOptions options = new ChromeOptions();
       
       WebDriver driver = Utilities.createDriver(options);
        
        HomePageActions homePageActions = new HomePageActions(driver);
        
        driver.manage().window().maximize();
        // Test Case Steps: 1 & 2
        homePageActions.navigateToHomePage("https://www.magicbricks.com/ ");
        Thread.sleep(3000);
        
        homePageActions.enterLocationAndSubmit("Mumbai");
        
        Thread.sleep(3000);
        
         // Step 3 & 4
        System.out.println("Property Prices (Descending Order):");
   
        homePageActions.getAllPropertyPrices();

        // Step 5 to click the 5th property link
        homePageActions.clickFifthProperty();
        
        Thread.sleep(1500);
        
        java.util.Set<String> handles=driver.getWindowHandles();
        
        Iterator it=handles.iterator();
        
        String parentidid=(String) it.next();
        String childid=(String) it.next();
        
        driver.switchTo().window(childid);
        
        Thread.sleep(1500);
        homePageActions.clickContactBuilder();
        Thread.sleep(1500);
        homePageActions.fillForm();

    
       driver.quit();
    }
}

