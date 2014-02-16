package workShop


import Resources.TestData
import workShop.pages.General
import workShop.pages.HomePage

import static Elements.ElementsSelectors.*
import static com.codeborne.selenide.Condition.exactText
import static com.codeborne.selenide.Condition.visible
import static core.ConditionHelpers.be

description "Adding new product functionality"

scenario "Add some product", {

    given "go to home page", {

        General.openHomePage();
    }
    and "delete product if it exist", {

        General.checkProductWithSameName(TestData.PRODUCT_NAME, TestData.NEW_PRODUCT_NAME);
    }
    when "create new product", {

        HomePage.addNewProduct(TestData.PRODUCT_NAME, TestData.PRODUCT_DIR);
    }
    then "new product added", {

        createdProductList().findBy(exactText(TestData.PRODUCT_NAME)).should(be(visible));
    }
    when "edit just created product", {

        HomePage.editCurrentProduct(TestData.PRODUCT_NAME, TestData.NEW_PRODUCT_NAME);
    }

    then "edited product has been created", {

        createdProductList().findBy(exactText(TestData.NEW_PRODUCT_NAME)).should(be(visible));
    }
}