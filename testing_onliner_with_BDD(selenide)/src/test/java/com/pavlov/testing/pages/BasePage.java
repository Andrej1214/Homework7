package com.pavlov.testing.pages;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public abstract class BasePage {
    public BasePage() {
        Configuration.browser = "chrome";
        Configuration.pageLoadTimeout = 20_000;
        open();
    }
}
