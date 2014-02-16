package com.workshop;

import Resources.TestData;
import org.junit.Before;
import org.junit.Test;
import workShop.pages.General;
import workShop.pages.HomePage;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 2/16/14
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class EditCreatedProductTest {

    @Before
    public void openWindow() {

        General.openHomePage();
    }

    @Test
    public void editCreatedProductTest() {

    HomePage.editCurrentProduct(TestData.PRODUCT_NAME, TestData.NEW_PRODUCT_NAME);
    }
}
