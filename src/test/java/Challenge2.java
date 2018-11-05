
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Challenge2 {

    WebDriver driver;

    String url;
    public ExtentReports report;
    public ExtentTest test;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                "");
        driver = new ChromeDriver();

    }

    @After
    public void teardown(){
        driver.quit();
    }


}
