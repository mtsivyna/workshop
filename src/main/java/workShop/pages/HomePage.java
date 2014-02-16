package workShop.pages;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

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

    public static void addNewProduct(String productName, String path) {

        addProductButton().isDisplayed();
        addProductButton().click();
        productNameInput().setValue(productName);
        productPathInput().setValue(path);
        createProductButton().click();
        dialogAcceptButton().click();
        createdProductList().findBy(exactText(productName)).should(be(visible));

    }

    public static void editCurrentProduct(String productName, String newProductName) {

        createdProductList().findBy(exactText(productName)).contextClick();
        editProductButton().click();
        productNameInput().clear();
        productNameInput().setValue(newProductName);
        dialogSaveButton().click();
        createdProductList().findBy(exactText(newProductName)).should(be(visible));
    }

    public static void removeDirectoryIfExist(String path) {

        File directory = new File("C:\\Tools\\Grible\\" + path);
            try {
                FileUtils.deleteDirectory(directory);
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
