package workShop.pages;

import static Elements.ElementsSelectors.*;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 2/15/14
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class General {


    public static void openHomePage(){

        open("http://localhost:8123/");
    }

    public static void checkProductWithSameName(String name, String editedName) {

        if (createdProductList().findBy(exactText(name)).isDisplayed()){

            createdProductList().findBy(exactText(name)).contextClick();
            deleteProductButton().click();
            dialogAcceptButton().click();


        }
        if (createdProductList().findBy(exactText(editedName)).isDisplayed()){

            createdProductList().findBy(exactText(editedName)).contextClick();
            deleteProductButton().click();
            dialogAcceptButton().click();
        }

        else {

            return;
        }
    }
}
