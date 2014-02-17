package workShop.widgets;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 2/16/14
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Table {
    public static ElementsCollection cells() {

        return $$(".table-cell>a");
    }
    public static SelenideElement cellByText(String exactText){

        return cells().findBy(exactText(exactText));
    }
}
