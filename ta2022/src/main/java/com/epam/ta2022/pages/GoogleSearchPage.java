package com.epam.ta2022.pages;

import com.epam.ta2022.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GoogleSearchPage {

    @Value("${google.url}")
    private String pageUrl;
    @Autowired
    private WebDriver webDriver;

    public void open(){
        webDriver.navigate().to(pageUrl);
    }
}
