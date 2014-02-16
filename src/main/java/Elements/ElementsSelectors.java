package Elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 2/16/14
 * Time: 12:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class ElementsSelectors {

    public static SelenideElement addProductButton() {

        return $("#btn-add-product");
    }

    public static SelenideElement productNameInput() {

        return $(".product-name");
    }

    public static SelenideElement productPathInput() {

        return $(".product-path");
    }

    public static SelenideElement createProductButton() {

        return $("#dialog-btn-add-product");
    }

    public static ElementsCollection createdProductList() {

        return $$(".table-cell>a");
    }

    public static SelenideElement deleteProductButton() {

        return $("#productMenu .delete");
    }

    public static SelenideElement dialogAcceptButton() {

        return $(".btn.btn-primary");
    }

    public static SelenideElement editProductButton() {

        return $("#productMenu .edit");
    }

    public static SelenideElement dialogSaveButton() {

        return $("#dialog-btn-edit-product");
    }
}
