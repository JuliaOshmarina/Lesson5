package tests;

import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;


public class GitEnterprize {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
    }

    @Test
    void gitenterpziseshould() {
        open("https://github.com/");

        $("[class~=HeaderMenu-nav]").$((byText("Solutions"))).hover();
        $(byTagAndText("a", "Enterprises")).click();
        $("[id=hero-section-brand-heading]").shouldHave(text("The AI-powered developer platform"));

    }




}
