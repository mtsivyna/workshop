package com.workshop;

import Resources.TestData;
import org.junit.Test;
import workShop.pages.General;
import workShop.pages.HomePage;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 2/15/14
 * Time: 12:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateNewProductTest {


    @Test
    public void createNewProduct()

    {

        General.openHomePage();
        HomePage.addNewProduct(TestData.PRODUCT_NAME, TestData.PRODUCT_DIR);


    }
}
