package com.nttdata.glue;

import com.nttdata.tasks.AddProductPage;
import com.nttdata.tasks.OpenPage;
import com.nttdata.tasks.PurchaseFormPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginGlue {
    private static final String ACTOR_NAME = "User";

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) estoy en la pagina opencart$")
    public void login(String actor) {
        theActorCalled(actor).attemptsTo(OpenPage.loadPage());
    }

    @When("selecciono un producto del catalogo$")
    public void selectProduct() {
        when(theActorInTheSpotlight()).attemptsTo(
                AddProductPage.addProductsToCart()
        );
    }

    @Then("ingreso al producto$")
    public void enterProduct() {
    }

    @Then("agrego el producto al carrito$")
    public void addProduct() {
    }

    @And("veo el carrito$")
    public void viewCart() {
    }

    @When("^ingreso datos (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void form(String name, String country, String city, String credit_card, String month, String year) {
        theActorInTheSpotlight().attemptsTo(
                PurchaseFormPage.withData(name, country, city, credit_card, month, year)
        );
    }

    @When("ingreso datos <name> <country> <city> <credit_card> <month> <year>")
    public void ingresoDatosNameCountryCityCredit_cardMonthYear() {
    }
}
