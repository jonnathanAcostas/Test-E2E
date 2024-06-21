package com.nttdata.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ShopPageInterface {
    public static final Target ENTER_THE_PRODUCT_1 = Target.the("Enter the Product 1").located(By.xpath("//*[@id='tbodyid']/div[1]/div/a"));
    public static final Target BTN_ADD_TO_CART_1 = Target.the("Button add to cart Product 1").located(By.xpath("//*[@id='tbodyid']/div[2]/div/a"));
    public static final Target BTN_GO_TO_HOME = Target.the("Button add to cart Product 1").located(By.xpath("//*[@class='container']/div/ul/li[1]/a"));
    public static final Target ENTER_THE_PRODUCT_2 = Target.the("Button add to cart Product 2").located(By.xpath("//*[@id='tbodyid']/div[2]/div/a"));
    public static final Target BTN_ADD_TO_CART_2 = Target.the("Button add to cart Product 2").located(By.xpath("//*[@id='tbodyid']/div[2]/div/a"));
    public static final Target BTN_CART = Target.the("Button Cart").located(By.xpath("//*[@class='container']/div/ul/li[4]/a"));

    public static final Target BTN_PLACE_ORDER = Target.the("Button View Cart").located(By.xpath("//*[@id='page-wrapper']/div/div[2]/button"));
    public static final Target BTN_CHECKOUT = Target.the("Button Checkout").located(By.xpath("//*[@id='content']/div[3]/div[2]/a"));
    public static final Target BTN_GUEST_CHECKOUT = Target.the("Button Guest Checkout").located(By.xpath("//*[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label/input"));
    public static final Target BTN_CONTINUE = Target.the("Button Continue").located(By.xpath("//*[@id='button-account']"));

}
