package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.BasePage;
import framework.web_pages.HomePage;
import org.testng.Assert;

public class ScrollSD {

    HomePage homePage = new HomePage();

   @Given("^I am on the home page$")
    public void iAmOnTheHomePage(){
       Assert.assertEquals(BasePage.getDriver().getTitle(),"Formy","WRONG TITLE");
   }

   @When("^I enter \"(.+)\" and \"(.+)\" the name field$")
    public void iEnterNameAndDate(String anyName, String anyDate){
       homePage.enterName("ilir ahmeti");
       homePage.enterDate("08/20/2018");
   }
}
