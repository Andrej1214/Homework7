package pages;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public abstract class BasePage {
    private static final int PAGE_LOAD_TIMEOUT = 20000;
    public BasePage() {
        Configuration.browser = "chrome";
        Configuration.pageLoadTimeout = PAGE_LOAD_TIMEOUT;
        open();
    }
}
