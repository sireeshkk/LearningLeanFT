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

        Link sPEAKERSLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("SPEAKERS")
                .tagName("SPAN").build());
        sPEAKERSLink.click();

        Button buyNowButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("BUY NOW")
                .tagName("BUTTON").build());
        buyNowButton.click();

        Button saveToCartButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("ADD TO CART")
                .tagName("BUTTON").build());
        saveToCartButton.click();

        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .accessibilityName("")
                .id("menuCart")
                .innerText("")
                .tagName("svg").build()).click();

        /*Link link = browser.describe(Link.class, new LinkDescription.Builder()
                .accessibilityName("")
                .innerText("1 ")
                .role("link")
                .tagName("A")
                .index(1).build());
        link.click();
*/
        WebElement rEMOVEWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("REMOVE")
                .tagName("A").build());
        rEMOVEWebElement.click();

        Link hOMELink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("HOME")
                .tagName("A").build());
        hOMELink.click();


        browser.close();

    }

}