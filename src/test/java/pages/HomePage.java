package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends PageObject {


    public void enterWhatKeywordText(String textKeyWord){
        WebElementFacade keywordTextBox=$(By.id("keywords-input"));
        keywordTextBox.waitUntilClickable(); //to add dynamic synchronization for page to load
        keywordTextBox.type(textKeyWord);
    }

    public void selectClassification(String value){
        $(By.xpath("//label[@data-automation='classificationDropDownList']")).click();

        ListOfWebElementFacades valList=findAll(By.xpath("//div[@id='classificationsPanel']/nav/ul/li"));
        for(int i=1;i<=valList.size();i++){
            WebElementFacade listD=$(By.xpath("//div[@id='classificationsPanel']/nav/ul/li["+i+"]/a"));
            if(listD.getAttribute("aria-label").contains(value)){
                listD.click();
                break;

            }


        }
        $(By.xpath("//label[@data-automation='classificationDropDownList']")).click();
    }


    public void enterWhereKeywordText(String location) throws InterruptedException {
      $(By.id("SearchBar__Where")).typeAndEnter(location);
        $(By.id("SearchBar__Where")).click();

    }


    public String searchResult(){
        String jobResult=$(By.id("SearchSummary")).getText();
        return jobResult;
    }

    public void clickSignInbutton(){
        $(By.xpath("(//a[@title='Sign in'])[1]")).click();
    }

    public void clickEmployerSiteBtn(){
        $(By.xpath("//a[@data-automation='employers_link']")).click();
    }
}
