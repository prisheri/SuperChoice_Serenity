package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SignInPage extends PageObject {

    public String getSignInpageTitle(){
        $(By.id("emailAddress")).waitUntilClickable();
        return getDriver().getTitle();

    }
}
