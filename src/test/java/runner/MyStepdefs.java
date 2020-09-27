package runner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I have a admin user$")
    public void iHaveAAdminUser() {
    }

    @When("^I set the login textbox with admin$")
    public void iSetTheLoginTextboxWithAdmin() {
    }

    @And("^I set the pwd textbod with admin(\\d+)$")
    public void iSetThePwdTextbodWithAdmin(int arg0) {
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
    }

    @Then("^I enter to the application$")
    public void iEnterToTheApplication() {
    }
}
