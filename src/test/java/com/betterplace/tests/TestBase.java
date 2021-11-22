package com.betterplace.tests;

import com.betterplace.utilities.ConfigurationReader;
import com.betterplace.utilities.Driver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String url;

    @BeforeMethod
    public void setupMethod(){
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        url = ConfigurationReader.getProperty("url1");
        driver.get(url);
        Dimension dimension = new Dimension(399,825);
        driver.manage().window().setSize(dimension);

    }

    @AfterTest
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(5);
        Driver.closeDriver();

    }

}
