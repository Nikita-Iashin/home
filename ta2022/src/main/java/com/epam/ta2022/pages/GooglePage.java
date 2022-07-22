package com.epam.ta2022.pages;

import com.epam.ta2022.utils.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Value;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Page
public class GooglePage extends BasePage {

    @Value("${google.url}")
    private String pageUrl;
    @FindBy(how = How.XPATH, using = "//img[@class = 'lnXdpd']")
    private WebElement text;

    public GooglePage open() {
        driver.navigate().to(pageUrl);
        return this;
    }

    public GooglePage isGoogleLogoExist() {
        assertTrue(text.isDisplayed());
        return this;
    }
}
