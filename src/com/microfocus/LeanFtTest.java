package com.microfocus;

import javafx.util.converter.LocalTimeStringConverter;
import org.testng.annotations.*;
import com.hp.lft.sdk.*;
import com.hp.lft.report.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.*;
import java.time.*;
import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    @BeforeClass
    public void beforeClass() throws Exception {
        //rrs
        ModifiableSDKConfiguration config = new ModifiableSDKConfiguration();
        SDK.init(config);
        Reporter.init();
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
    }

    @AfterMethod
    public void afterMethod() throws Exception {

    }
//    BrowserType bType = BrowserType.CHROME; //    @Parameters({"browserToOpen"})

    @Test
    @Parameters({"browserToOpen"})
    public void myNewTest(BrowserType bType) throws GeneralLeanFtException, InterruptedException {
        // adding a time stamp so it is clear that both browsers are starting at same time
        System.out.println("Starting browser: " + bType + " at: " +LocalTime.now());
        Browser browser = BrowserFactory.launch(bType);
        System.out.println("Browser launch : " + bType + " complete at: " +LocalTime.now());
        Thread.sleep(3*1000);
        browser.navigate("msn.com");
        Thread.sleep(5*1000);
        browser.navigate("google.com");
        Thread.sleep(5*1000);
        System.out.println("Stopping:" + LocalTime.now());

        browser.close();

    }

}