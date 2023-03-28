package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ContactPage {
    private static WebElement companyNameID = null;
    private static WebElement firstNameid = null;
    private static WebElement lastNameid = null;
    private static WebElement workEmialid = null;
    private static WebElement phoneid = null;
    private static WebElement countryid = null;
    private static WebElement enquiryDetailsid = null;
    private static WebElement feedbackid = null;
    private static WebElement agreeConditionsid = null;
    public static WebElement companyName(WebDriver driver){
        companyNameID = driver.findElement(By.xpath("//*[contains(text(),\"Company Name*\")]//following::input"));
        return companyNameID;
    }

    public static WebElement firstName(WebDriver driver){
        firstNameid = driver.findElement(By.xpath("//*[contains(text(),\"First Name*\")]//following::input"));
        return firstNameid;
    }

    public static WebElement lastName(WebDriver driver){
        lastNameid = driver.findElement(By.xpath("//*[contains(text(),\"First Name*\")]//following::input[2]"));
        return lastNameid;
    }

    public static WebElement workEmial(WebDriver driver){
        workEmialid = driver.findElement(By.xpath("//*[contains(text(),\"Work Email*\")]//following::input"));
        return workEmialid;
    }

    public static WebElement phone(WebDriver driver){
        phoneid = driver.findElement(By.xpath("//*[contains(text(),\"Work Email*\")]//following::input[2]"));
        return phoneid;
    }

    public static WebElement country(WebDriver driver){
        countryid = driver.findElement(By.xpath("//*[contains(text(),\"Country*\")]//following::select"));
        return countryid;
    }

    public static WebElement enquiryDetails(WebDriver driver){
        enquiryDetailsid = driver.findElement(By.xpath("//*[contains(text(),\"Country*\")]//following::textarea"));
        return enquiryDetailsid;
    }

    public static WebElement referal(WebDriver driver){
        feedbackid = driver.findElement(By.xpath("//*[contains(text(),\"Country*\")]//following::select[2]"));
        return feedbackid;
    }

    public static WebElement agreeConditions(WebDriver driver){
        agreeConditionsid = driver.findElement(By.xpath("//*[contains(text(),\"Country*\")]//following::input[@type='checkbox']"));
        return agreeConditionsid;
    }

}
