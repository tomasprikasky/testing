package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ClickMeBaby {

    @Test
    void itShouldBeOneClick(){

    //1.open page
    open("http://ajtyvit-app.westeurope.cloudapp.azure.com:8080/clickmebaby.php");
    //2. find button click me baby and click
        $(byId("clickMe")).click();
    //3. validate number of clicks
        $(byId("clicks")).shouldHave(Condition.text("1"));
    //4. validate text
        $(byCssSelector("p.description")).shouldHave(Condition.text("klik"));
    }
}
