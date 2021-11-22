package com.betterplace.tests;

import com.betterplace.pages.BasePage;
import com.betterplace.pages.SuccessPage;
import com.betterplace.utilities.ConfigurationReader;
import com.betterplace.utilities.Driver;
import com.betterplace.utilities.ReusableMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Challenge extends TestBase{

    protected WebDriver driver;
//
//    String url1 = ConfigurationReader.getProperty("url1");

    SuccessPage successPage = new SuccessPage();

    @Test
    public void Test1() {

//        driver = Driver.getDriver();
//        url = ConfigurationReader.getProperty("url1");
//        driver.get(url);

        successPage.acceptCookies();
        successPage.amountField.sendKeys(Keys.chord(Keys.CONTROL,"a"),"5");
        successPage.uberweisungButton.click();

        ReusableMethods.scrollToElement(successPage.name);
        successPage.name.sendKeys("Omer");
        successPage.surname.sendKeys("Talha");
        successPage.email.sendKeys("test@betterplace.org");

        ReusableMethods.scrollToElement(successPage.submitButton);
        successPage.submitButton.click();




    }

    @Test
    public void Test2() {

//        driver = Driver.getDriver();
//        url = ConfigurationReader.getProperty("url2");
//        driver.get(url);

        successPage.acceptCookies();
        successPage.amountField.sendKeys(Keys.chord(Keys.CONTROL,"a"),"5");
        successPage.uberweisungButton.click();

        ReusableMethods.scrollToElement(successPage.name);
        successPage.name.sendKeys("Omer");
        successPage.surname.sendKeys("Talha");
        successPage.email.sendKeys("test@betterplace.org");

        ReusableMethods.scrollToElement(successPage.submitButton);
        successPage.submitButton.click();


    }

}
