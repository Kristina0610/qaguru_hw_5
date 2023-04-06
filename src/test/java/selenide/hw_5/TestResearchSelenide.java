package selenide.hw_5;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TestResearchSelenide extends TestBaseClass {
  @Test
  void successfulResearchSelenideTest() {
    // Откройте страницу Selenide в Github
    open("https://github.com");
    $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
    $$("ul.repo-list li").first().$("a").click();
    // Перейдите в раздел Wiki проекта
    $("#wiki-tab").click();
    // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
    WebDriverRunner.getWebDriver().manage().window().maximize();
    $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
    // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
    $(byText("SoftAssertions")).shouldBe(visible).click();
    $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
  }

}
