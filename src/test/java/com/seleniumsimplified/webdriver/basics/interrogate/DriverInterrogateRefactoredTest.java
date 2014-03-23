package com.seleniumsimplified.webdriver.basics.interrogate;

import com.seleniumsimplified.webdriver.manager.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;
=======

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
>>>>>>> 24aef8a069dcdc20962c5543cec9e83949b67c91

public class DriverInterrogateRefactoredTest {

    public static WebDriver driver;

    @BeforeClass
    public static void startDriver(){
        driver = Driver.get();
        //driver = new FirefoxDriver();
    }

    @Test
    public void driverLevelPageInterrogateMethods(){

        final String theTestPageURL =
                "http://www.compendiumdev.co.uk/selenium/basic_web_page.html";

        driver.navigate().to(theTestPageURL);

        assertThat(driver.getTitle(), is("Basic Web Page Title"));
        assertThat(driver.getCurrentUrl(), is(theTestPageURL));
<<<<<<< HEAD
        assertThat(driver.getPageSource(), containsString("A paragraph of text"));
=======
        //assertThat(driver.getPageSource(), containsString("A paragraph of text"));
>>>>>>> 24aef8a069dcdc20962c5543cec9e83949b67c91
    }

    @AfterClass
    public static void stopDriver(){
        //driver.quit();
    }

}
