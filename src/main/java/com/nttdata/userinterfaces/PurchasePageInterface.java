package com.nttdata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class PurchasePageInterface {
    public static final Target INP_NAME = Target.the("Input Name").located(By.xpath("//*[@id='name']"));
    public static final Target INP_COUNTRY = Target.the("Input Country").located(By.xpath("//*[@id='country']"));
    public static final Target INP_CITY = Target.the("Input City").located(By.xpath("//*[@id='city']"));
    public static final Target INP_CARD = Target.the("Input Card").located(By.xpath("//*[@id='card']"));
    public static final Target INP_MONTH = Target.the("Input Month").located(By.xpath("//*[@id='month']"));
    public static final Target INP_YEAR = Target.the("Input Year").located(By.xpath("//*[@id='year']"));
    public static final Target BTN_CONFIRM = Target.the("Button Confirm").located(By.xpath("//button[@onclick='purchaseOrder()']"));;

}