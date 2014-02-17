package workShop.pages;

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

}
