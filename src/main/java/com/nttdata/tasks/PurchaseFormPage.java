package com.nttdata.tasks;

import com.nttdata.userinterfaces.PurchasePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseFormPage implements Task {


    public final String name;
    public final String country;
    public final String city;
    public final String credit_card;
    public final String month;
    public final String year;



    public PurchaseFormPage(String name, String country, String city, String credit_card, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.credit_card = credit_card;
        this.month = month;
        this.year = year;

    }

    public static Performable withData(String name, String country, String city, String credit_card, String month, String year) {
        return instrumented(PurchaseFormPage.class, name, country, city, credit_card, month, year);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(PurchasePageInterface.INP_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(name).into(PurchasePageInterface.INP_NAME),

                WaitUntil.the(PurchasePageInterface.INP_COUNTRY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(country).into(PurchasePageInterface.INP_COUNTRY),

                WaitUntil.the(PurchasePageInterface.INP_CITY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(city).into(PurchasePageInterface.INP_CITY),

                WaitUntil.the(PurchasePageInterface.INP_CARD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(credit_card).into(PurchasePageInterface.INP_CARD),

                WaitUntil.the(PurchasePageInterface.INP_MONTH, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(month).into(PurchasePageInterface.INP_MONTH),

                WaitUntil.the(PurchasePageInterface.INP_YEAR, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(year).into(PurchasePageInterface.INP_YEAR),


                WaitUntil.the(PurchasePageInterface.BTN_CONFIRM, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BTN_CONFIRM)

                );
    }
}
