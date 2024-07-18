package com.nttdata.tasks;

import com.nttdata.userinterfaces.ShopPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductPage implements Task {
    public static Task addProductsToCart() {
        return instrumented(AddProductPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ShopPageInterface.ENTER_THE_PRODUCT_1, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.ENTER_THE_PRODUCT_1),

                WaitUntil.the(ShopPageInterface.BTN_ADD_TO_CART_1, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_ADD_TO_CART_1),

                WaitUntil.the(ShopPageInterface.BTN_GO_TO_HOME, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_GO_TO_HOME),

                WaitUntil.the(ShopPageInterface.ENTER_THE_PRODUCT_2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.ENTER_THE_PRODUCT_2),

                WaitUntil.the(ShopPageInterface.BTN_ADD_TO_CART_2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_ADD_TO_CART_2),

                WaitUntil.the(ShopPageInterface.BTN_CART, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_CART),

                WaitUntil.the(ShopPageInterface.BTN_PLACE_ORDER, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_PLACE_ORDER)
        );
    }

}
