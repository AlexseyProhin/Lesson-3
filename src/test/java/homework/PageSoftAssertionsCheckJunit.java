package homework;

import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PageSoftAssertionsCheckJunit {

    @DisplayName("Во вкладке SoftAssertions, есть пример кода JUnit5")
    @Test
    void chekExampleCodeJunit() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(byText("SoftAssertions")).click(); // кликнет по найденому тексту в поиске
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));









    }
}
/*
- Откройте страницу Selenide в Github

 - Перейдите в раздел Wiki проекта

 - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions

 - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
 */