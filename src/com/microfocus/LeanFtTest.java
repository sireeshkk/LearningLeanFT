package com.microfocus;

import static org.junit.Assert.*;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import com.hp.lft.unittesting.Parameters;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import com.hp.lft.sdk.web.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() throws GeneralLeanFtException, ReportException {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testChrome() throws GeneralLeanFtException,ReportException
    {
        test(BrowserType.CHROME);
    }

    @Test
    public void testFirefox() throws GeneralLeanFtException,ReportException
    {
        test(BrowserType.FIREFOX);
    }

    @Parameters({"browserName"})
    public void test(BrowserType browserName) throws GeneralLeanFtException, ReportException {
        Browser browser = BrowserFactory.launch(browserName);
        // was Browser browser = BrowserFactory.launch(BrowserType.CHROME);

        browser.navigate("http://advantageonlineshopping.com");

        LearnApplicationModels appModel = new LearnApplicationModels(browser);

        appModel.SPEAKERSLink().click();
        appModel.BuyNow().click();
        appModel.SaveToCartButton().click();
        appModel.MenuCartWebElement().click();
        String total = appModel.TotalInCart().getInnerText();
        String[] total_split = total.split("\\$");
        String justNumber = total_split[1];
        System.out.println(justNumber);
        String noCommas = justNumber.replaceAll(",","");
        System.out.println(noCommas);
        double totalValue = Double.valueOf(noCommas);
        Verify.greaterOrEqual(totalValue, 2000.0, "VerName", "Long verification description");

        if (totalValue >= 2000) {
            Reporter.reportEvent("alsoVerName", "In this description - it passed", Status.Passed);
        } else {
            Reporter.reportEvent("alsoVerName", "In this description - something wrong, failed!", Status.Failed);
        }
        appModel.REMOVEWebElement().click();
        appModel.HOMELink().click();

        browser.close();
    }

}