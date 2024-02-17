package steps;

import net.serenitybdd.annotations.Step;
import pages.EmployerPage;

public class EmployerStepPage {

    EmployerPage empPage;
    @Step
    public String verifySeekEmployerPage(){
        return empPage.getEmployerpageTitle();

    }
}
