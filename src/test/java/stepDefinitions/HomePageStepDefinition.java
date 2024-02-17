package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import steps.EmployerStepPage;
import steps.HomeStepPage;
import steps.SignInStepPage;


public class HomePageStepDefinition {
    @Steps
    EmployerStepPage employerPageObj;

    @Steps
    HomeStepPage homePageObj;

    @Steps
    SignInStepPage signInPageObj;

    @Given("user is on seek landing page")
    public void user_is_on_seek_landing_page() {
        homePageObj.openApplication();
    }
    @When("user enters {string} {string} {string} in search boxes")
    public void user_enters_in_search_boxes(String whatText, String classification, String whereText) throws InterruptedException {
        homePageObj.enterWhatKeyword(whatText);
        homePageObj.selectClassification(classification);
        homePageObj.enterWhereKeyword(whereText);

    }

    @Then("relevant search results are displayed")
    public void relevant_search_results_are_displayed() {
        Assert.assertTrue("Job results are successfully displayed",homePageObj.searchResult()!="");


        System.out.println("Number of jobs are "+homePageObj.searchResult());
    }


    @When("user clicks on {string} button")
    public void user_clicks_on_button(String string) {

    }
    @Then("Sign In page should displayed")
    public void sign_in_page_should_displayed() {

    }
    @Then("user is able to sign In")
    public void user_is_able_to_sign_in() {

    }
}
