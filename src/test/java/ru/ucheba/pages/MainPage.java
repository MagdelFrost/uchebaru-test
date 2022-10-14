package ru.ucheba.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    @Step("Откроем главную страницу")
    public MainPage openPage() {
        open("https://www.ucheba.ru");

        return this;
    }

    @Step("Откроем страницу входа")
    public MainPage signInPage() {
        $(By.linkText("Войти")).click();

        return this;
    }

    @Step("Мы попали на верную страницу")
    public void checkSignInPage() {
        $("*").shouldHave(Condition.text("Укажите номер мобильного телефона"));
    }

    @Step("Выбираем город Санкт-Петербуург")
    public MainPage chooseCity() {
        $(".Textstyles__Block-sc-8ry03o-0 iCDSna").click();
        $(".Selectstyles__Activator-sc-1avj0mz-4 hggoWZ").click();
        $(".Textstyles__Block-sc-8ry03o-0 gDjdQe").click();
        $(".Buttonstyles__Block-sc-tiemc6-3 Button___StyledBlock-sc-nvyixc-0 bRZSjl").click();

        return this;
    }

    @Step("Мы попали на верную страницу")
    public void checkNewCityPage() {
        $("*").shouldHave(Condition.text("Я хочу поступить в университет в Санкт-Петербурге"));
    }
}
