package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class GenericMethodPage {

    public WebDriver driver;
        private static WebElement cookiesid = null;
        public static WebElement cookiesmethodaccept(WebDriver driver){
            cookiesid = driver.findElement(By.xpath("//*[contains(text(),\"Accept\")]//following::a[2]"));
            //id("cookie_action_close_header")
            return cookiesid;
        }




}
