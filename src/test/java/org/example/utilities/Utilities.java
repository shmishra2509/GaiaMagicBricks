package org.example.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utilities {

    public static WebDriver createDriver(ChromeOptions options) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivam Mishra\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");
         return new ChromeDriver();
            
    }
    }