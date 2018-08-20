package framework.web_pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By enterName = By.id("name");
    private By enterDate = By.id("date");

    public void enterName(String text){
        sendValue(enterName, text);
    }

    public void enterDate(String text){
        sendValue(enterDate, text);
    }

//    public String getTitle(){
//        return getText()
//    }


}
