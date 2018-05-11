package com.microfocus;

import static org.junit.Assert.*;

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

    public LeanFtTest() {
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
    public void setUp()  {
    }

    @After
    public void tearDown()  {
    }

    @Test
    public void mySecondTest() throws GeneralLeanFtException {

        Browser browser = BrowserFactory.launch(BrowserType.CHROME);
        browser.navigate("http://www.advantageonlineshopping.com:8080/");

        LearnApplicationModels appModel = new LearnApplicationModels(browser);
        appModel.SPEAKERSLink().click();
        appModel.BuyNow().click();
        appModel.SaveToCartButton().click();
        appModel.MenuCartWebElement().click();
        appModel.REMOVEWebElement().click();
        appModel.HOMELink().click();


        browser.close();

    }

}