package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Utils{

    public void userIsOnHomePage()
    {
        assertURL( "https://demo.nopcommerce.com/" );
    }

    public void userClicksOnLinkFromTopMenu(String category)
    {
        driver.findElement( By.linkText( category ) ).click();
    }

    public void hooverOverCategoryLink(String category)
    {
        WebElement link_category = driver.findElement( By.linkText(category ) ) ;
        Actions builder = new Actions(driver);
        Action mouseOverCategory = builder.moveToElement( link_category ).build();
        mouseOverCategory.perform();
    }

    public void clickOnSubcategoryLink(String subcategory)
    {
        clickOnElement( By.linkText(subcategory) );
    }

    public void userShouldBeAbleToNavigateToSubcategoryPageSuccessfully(String subcategory)
    {
        assertURL( subcategory);
    }
}
