package ru.ucheba;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PageTests extends BaseTest{

//    @Test
//    @DisplayName("Проверяем переход на страницу входа")
//    public void singInPageTest() {
//        mainPage.openPage()
//                .signInPage()
//                .checkSignInPage();
//    }

    @Test
    @DisplayName("Проверяем переход на страницу входа")
    public void changeLanguage() {
        mainPage.openPage()
                .chooseCity()
                .checkNewCityPage();
    }
}
