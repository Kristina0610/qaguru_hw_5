package selenide.hw_5;

import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;

public class TestBaseClass {
  @BeforeAll
  static void beforeAll() {
    browser = "firefox";
    browserSize = "1520x1080";
    holdBrowserOpen = true;
    timeout = 6000;

  }

}
