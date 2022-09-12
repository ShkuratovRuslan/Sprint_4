package ru.yandex.practikum;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}