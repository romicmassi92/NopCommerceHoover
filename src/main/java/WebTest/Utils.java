package WebTest;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Utils extends BasePage {

    public static void assertURL(String text)
    {
        Assert.assertTrue( driver.getCurrentUrl().contains( text ) );
    }

    public static void clickOnElement(By by)
    {
        driver.findElement( by ).click();
    }

    public static String getTextElement(By by)
    {
        String get_text = driver.findElement( by ).getText();
        return get_text;
    }
}
