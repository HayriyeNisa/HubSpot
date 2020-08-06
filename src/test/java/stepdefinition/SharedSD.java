package stepdefinition;

import Utils.BasePage;
import Utils.ConfigReader;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import runnerTest.webPage.ElementUtil;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SharedSD {

    ElementUtil elementUtil = new ElementUtil();
    private static Logger logger = Logger.getLogger(SharedSD.class);

    // Hook class

    @Before

    public void setUp() {
        logger.info("****************************");
        logger.info("Test setup method is starting.....");
        ConfigReader.getProperty("browser");
        BasePage.get().get(ConfigReader.getProperty("url"));
        BasePage.get().manage().window().maximize();

    }

    @After

    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            logger.error("Test failed!");
            byte[] screenshot = ((TakesScreenshot) BasePage.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            elementUtil.getScreenShot("pic");

        } else {
            logger.info("Cleanup!");
            logger.info("Test completed...!");

        }
        logger.info("*****************************");
        BasePage.closeBrowser();


    }
}