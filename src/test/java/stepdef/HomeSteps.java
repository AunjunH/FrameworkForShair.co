package stepdef;

import ShairPages.ShairHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

   ShairHomePage HomePage  = new ShairHomePage();

    @Then("verify user is on homepage")
    public void verify_user_is_on_homepage() {
        ShairHomePage.verifyPage();
    }

    @When("user clicks on user badge")
    public void user_clicks_on_user_badge() {
        ShairHomePage.clickOnUserBadge();
    }

    @When("click on logout link")
    public void click_on_logout_link() {
        ShairHomePage.clickOnLogoutLink();
    }
}


