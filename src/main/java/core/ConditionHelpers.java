package core;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 2/16/14
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConditionHelpers {

//    public static Condition be(Condition condition){
//        return condition;
//    }

    public static Condition be(final Condition condition){
        return new Condition("be " + condition) {
            @Override
            public boolean apply(WebElement webElement) {
                return condition.apply(webElement);
            }
        };
    }
}
