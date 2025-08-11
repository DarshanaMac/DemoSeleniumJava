package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMain {

	public static void main(String[] args) {
	
		// Setup ChromeDriver automatically using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");

        // Print the title
        System.out.println("Page title: " + driver.getTitle());

        // Close browser
        driver.quit();
	}

}
