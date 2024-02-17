package steps;

import net.serenitybdd.annotations.Step;
import pages.SignInPage;

public class SignInStepPage {

    SignInPage signPage;

    @Step
    public String verifySignInPage(){
        return signPage.getSignInpageTitle();


    }
}
