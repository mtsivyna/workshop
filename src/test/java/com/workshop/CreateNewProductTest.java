package com.workshop;

import Resources.TestData;
import org.junit.Before;
import org.junit.Test;
import workShop.pages.General;

import static workShop.pages.HomePage.*;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 2/15/14
 * Time: 12:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateNewProductTest {

    @Before
    public void givenHomePageIsOpened() {

        General.openHomePage();
    }

    @Test
    public void testProductCanBeAdded() {

        deletesProductsIfExist(TestData.PRODUCT_NAME, TestData.NEW_PRODUCT_NAME); //TODO: refactor to delete only PRODUCT_NAME
        removeDirectoryIfExist(TestData.PRODUCT_DIR);

        addNewProduct(TestData.PRODUCT_NAME, TestData.PRODUCT_DIR);
    }

}
