package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import pages.CoursePage;
import pages.HomePage;
import pages.RegisterPage;

import java.util.Arrays;
import java.util.List;

public class FreeRangerSteps {

    HomePage homePage = new HomePage();
    CoursePage coursePage = new CoursePage();
    RegisterPage registerPage = new RegisterPage();

    @Given("I navigate to www.freerangetesters.com")
    public void i_navigate_to_www_freerangetesters() {
        homePage.navigateToFreeRangeTesters();
    }

    @When("I go to  {word} using the navigation bar")
    public void navigationBarUse(String section) {
        homePage.clickOnSectionNavigation(section);

    }
    @When("I select Elegir plan")
    public void selectElegirPlan() {
        homePage.clickOnElegirPlanButton();
    }
    @And("select Introducción al Sesting de Software")
    public void navigationToIntro() {
        coursePage.clickOnIntroduccionTestingLink();
    }
    @Then("I can validate the oprions in the checkout page")
    public void validateCheckoutPlans(){
        List<String> expectect= Arrays.asList("Academia: $16.99 / mes • 13 productos"
                ,"Academia: $176 / año • 13 productos",
                "Free: Gratis • 3 productos");
        List<String> registro= registerPage.getPlanDropdown();
        System.out.printf(registro.toString());
        Assert.assertEquals(expectect,registro);

    }
}
