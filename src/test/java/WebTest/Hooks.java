package WebTest;

import org.junit.After;
import org.junit.Before;

public class Hooks extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser(){browserSelector.setupBrowser();}

    @After
    public void closeBrowser(){driver.quit();}
}
