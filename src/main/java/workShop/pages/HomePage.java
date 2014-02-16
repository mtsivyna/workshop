package workShop.pages;

import static Elements.ElementsSelectors.*;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static core.ConditionHelpers.be;


/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 2/15/14
 * Time: 2:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class HomePage {

    public static void addNewProduct(String name, String path) {

        addProductButton().isDisplayed();
        addProductButton().click();
        productNameInput().setValue(name);
        productNameInput().setValue(path);
        createProductButton().click();
        createdProductList().findBy(exactText(name)).should(be(visible));
        createdProductList().findBy(exactText(name)).contextClick();
        deleteProductButton().click();
        dialogAcceptButton().click();

    }
}
