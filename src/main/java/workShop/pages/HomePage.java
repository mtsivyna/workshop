package workShop.pages;


import org.apache.commons.io.FileUtils;
import workShop.widgets.Table;

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

    public static void addNewProduct(String productName, String productPath) {

        addProductButton().click();
        productNameInput().setValue(productName);
        productPathInput().setValue(productPath);
        createProductButton().click();
        dialogAcceptButton().click();
        Table.cellByText(productName).should(be(visible));
    }

    public static void editCurrentProduct(String productName, String newProductName) {

        Table.cellByText(newProductName).contextClick();
        editProductButton().click();
//        ContextMenu.editItem().click();
//        ContextMenu.edit();
        productNameInput().setValue(newProductName);
        dialogSaveButton().click();
        Table.cellByText(newProductName).should(be(visible));
    }

    public static void removeDirectoryIfExist(String path) {

        File directory = new File("C:\\Tools\\Grible\\" + path);
            try {
                FileUtils.deleteDirectory(directory);
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    //TODO: refactor to use varargs
    public static void deletesProductsIfExist(String name, String editedName) {

        if (Table.cells().findBy(exactText(name)).isDisplayed()){

            Table.cells().findBy(exactText(name)).contextClick();
            deleteProductButton().click();
            dialogAcceptButton().click();
        }
        if (Table.cells().findBy(exactText(editedName)).isDisplayed()){

            Table.cells().findBy(exactText(editedName)).contextClick();
            deleteProductButton().click();
            dialogAcceptButton().click();
        }

        else {

            return;
        }
    }
}
