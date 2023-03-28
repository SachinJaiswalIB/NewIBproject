package org.example;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class RunnerPage {

    private static WebDriver driver=null;


    public static void main(String[] args) throws InterruptedException {
        }


    @BeforeTest
    public void startBrowser () {
        System.out.println("Browser Initialize");
        String launchUrl = "https://www.intelligencebank.com/contact-us/";

        //driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        System.out.println("Starting Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(launchUrl);

//           By cookiesmethodaccept=By.xpath("//*[contains(text(),\"Accept\")]//following::a[2]");
//            //id("cookie_action_close_header")
//            cookiesmethoda;
//            WebDriverWait wait=new WebDriverWait(driver, 20);
//            wait.until(ExpectedConditions.elementToBeClickable(cookiesmethodaccept)).click();
////            wait.until(ExpectedConditions.invisibilityOfElementLocated(cookiesmethodaccept));
////            wait.until(ExpectedConditions.elementToBeClickable(cookiesmethodaccept)).click();

        GenericMethodPage.cookiesmethodaccept(driver).click();
//            String webTitle = driver.getTitle();
//            Reporter.log(webTitle);
//            int size = driver.findElements(By.tagName("iframe")).size();

        WebElement f1 = driver.findElement(By.xpath("//*[contains(@action,'2gdc87p')]"));
        driver.switchTo().frame(f1);

    }

            @Test
            public void stepsforexecution () throws InterruptedException {


                Thread.sleep(2);
                ContactPage.companyName(driver).sendKeys("Patona");
                ContactPage.firstName(driver).sendKeys("Sachin");
                ContactPage.lastName(driver).sendKeys("Jaiswa");
                ContactPage.workEmial(driver).sendKeys("sachin@gmail.com");
                ContactPage.phone(driver).sendKeys("95656456546");

                Select countrylist = new Select(ContactPage.country(driver));
                countrylist.selectByValue("India");

                ContactPage.enquiryDetails(driver).sendKeys("Good");

                Select referallist = new Select(ContactPage.referal(driver));
                referallist.selectByValue("Webinar");

                ContactPage.agreeConditions(driver).sendKeys("testuser_1");

                WebElement checkBoxAgree = ContactPage.agreeConditions(driver);
                boolean isSelected = checkBoxAgree.isSelected();

                if (isSelected == false) {
                    checkBoxAgree.click();
                }

                File SC = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

                try {
                    FileHandler.copy(SC, new File("D://SN.png"));
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

            }

//        Assert.assertEquals("hi","hi");
//        Reporter.log("Finish");



            @AfterTest
            public void stopBrowser () {
                driver.quit();
                Reporter.log("Finish");
                System.out.println("Browser stopped");

            }

        }


