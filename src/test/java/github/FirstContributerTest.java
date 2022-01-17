package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstContributerTest {

    @DisplayName("Первый контрибъютер Андрей Солнцев")
    @Test
    void chekFirstAndrey () {
        open("https://github.com/selenide/selenide");
        //$(".Layout-sidebar").$(byText("Contributors")).closest("div")
        //        .$$("ul li").first().hover();
        // Ищем в дом дереве сайд бар, в нем по тексту контрибъютерс, закрываем дом дерево до верхнего дива
        //  далее по всему лойаут найти все  ul li и выбрали первый

        $$(".Layout-sidebar .BorderGrid-row").find(text("Contributors"))
                .$$("ul li").first().hover();
        // Выбрали сайт бар и уточнили что в бордере рав есть елемент с текстом
        // выбрали все ул и выбрали первый ли
        // find найти элемент
        $$(".Popover-message").find(visible).shouldHave(text("Andrei Solntsev"));
    }


}
