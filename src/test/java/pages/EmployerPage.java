package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EmployerPage extends PageObject {

    public String getEmployerpageTitle(){
        $(By.id("email")).waitUntilClickable();
        return getDriver().getTitle();

    }


}
