package selenide.hw_5;

import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;

public class BaseClass {
  @BeforeAll
  static void beforeAll() {
    baseUrl = "https://github.com";
    browser = "firefox";
    browserSize = "1520x1080";
    holdBrowserOpen = true;

  }

}
