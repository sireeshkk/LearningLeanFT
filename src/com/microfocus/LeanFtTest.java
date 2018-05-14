package com.microfocus;

import javafx.util.converter.LocalTimeStringConverter;
import org.testng.annotations.*;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.*;
import java.time.*;
import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    @BeforeClass
    public void beforeClass() throws Exception {
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
    public void myNewTest(BrowserType bType, String printMe) throws GeneralLeanFtException, InterruptedException {
//        System.out.println("Starting" + printMe  + ": " +LocalTime.now());
        Browser browser = BrowserFactory.launch(bType);
        Thread.sleep(3+1000);
        browser.navigate("msn.com");
        System.out.println(printMe);
        Thread.sleep(5*1000);
        browser.navigate("google.com");
        Thread.sleep(5*1000);
//        System.out.println("Stopping:" + LocalTime.now());

        browser.close();
    }

}