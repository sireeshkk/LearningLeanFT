package somename;

import static org.junit.Assert.*;

import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.*;
import org.apache.commons.csv.*;

import unittesting.*;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    Browser browser;
    @BeforeClass
    public static  void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public  static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
        browser = BrowserFactory.launch(BrowserType.CHROME);
        browser.navigate("http://advantageonlineshopping.com:8080");
    }

    @After
    public void tearDown() throws Exception {
        browser.close();
    }

    @Test
    public void test() throws GeneralLeanFtException, IOException {
        Reader reader = Files.newBufferedReader(Paths.get("./resources/search.csv"));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        Iterable<CSVRecord> csvRecords = csvParser.getRecords();

        for (CSVRecord csvRecord : csvRecords) {
            // Accessing Values by Column Index

            String search = csvRecord.get(0);
            System.out.println(search);

            browser.describe(Link.class, new LinkDescription.Builder()
                    .innerText(search)
                    .tagName("SPAN").build()).click();
            browser.back();
        }
        csvParser.close();
        reader.close();


    }

}