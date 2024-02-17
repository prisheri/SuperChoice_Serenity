package steps;

import net.serenitybdd.annotations.Step;
import pages.HomePage;

public class HomeStepPage {

    HomePage homePage;

    @Step
    public void openApplication(){
        homePage.open();

    }

    @Step
    public void enterWhatKeyword(String textKeyWord){
        homePage.enterWhatKeywordText(textKeyWord);
    }

    @Step
    public void selectClassification(String value){
        homePage.selectClassification(value);


    }

    @Step
    public void enterWhereKeyword(String location) throws InterruptedException {
        homePage.enterWhereKeywordText(location);
    }


    @Step
    public String searchResult(){
        return homePage.searchResult();
    }

    @Step
    public void clickSignInButton(){
        homePage.clickSignInbutton();
    }

    @Step
    public void clickEmployerSiteButton(){
        homePage.clickEmployerSiteBtn();
    }

    @Step
    public void clickMoreOptions(){

    }

    @Step
    public void moreOptionsFilters(){

    }


}
