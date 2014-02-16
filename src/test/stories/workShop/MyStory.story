package workShop

import static com.codeborne.selenide.Condition.appear
import Resources.TestData

import static com.codeborne.selenide.Condition.exactText
import static com.codeborne.selenide.Condition.visible
import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.$$
import static com.codeborne.selenide.Selenide.open
import static core.ConditionHelpers.be

description "Adding new product functionality"

scenario "Add some product", {

    given "go to home page", {

        open("http://localhost:8123/");
    }
    and "product isn't exist", {

    }
    when "click on create button", {
        $("#btn-add-product").isDisplayed();
        $("#btn-add-product").click();
        $(".product-name").setValue(TestData.PRODUCT_NAME);
        $(".product-path").setValue(TestData.PRODUCT_DIR);
        $("#dialog-btn-add-product").click();
    }
    then "new product added", {

        $$(".table-cell>a").findBy(exactText(TestData.PRODUCT_NAME)).should(be(visible));
    }
    and "remove just added product", {


        $$(".table-cell>a").findBy(exactText(TestData.PRODUCT_NAME)).contextClick();
        $("#productMenu .delete").click();
        $(".btn.btn-primary").click();
    }
}