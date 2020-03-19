import WebTest.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    HomePage homePage = new HomePage();

    @Given("user is on home page")
    public void userIsOnHomePage() {
    }

    @When("user hoover over {string} category link and click on subcategory link {string}")
    public void userHooverOverCategoryLinkAndClickOnSubcategoryLink(String category, String subcategory) {

        homePage.hooverOverCategoryLink(category);
        homePage.clickOnSubcategoryLink(subcategory);
    }

    @Then("user should able to navigate to subcategory page {string} successfully")
    public void userShouldAbleToNavigateToSubcategoryPageSuccessfully(String subcategory) {
        homePage.userShouldBeAbleToNavigateToSubcategoryPageSuccessfully(subcategory);
    }
}
