package com.epam.ta2022.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestPage extends BasePage {

    public TestPage(){
        System.out.println("Just to remember how @PostConstruct Works");
    }

    @PostConstruct
    private void print(){
        System.out.println("Object is ready, and there is @PostConstruct");
    }

    @Value("${url}")
    private String pageUrl;
    @Autowired
    private WebDriver webDriver;

    @FindBy(how = How.XPATH, xpath = "//h1")
    private WebElement title;

    public String getTitle() {
        return title.getText();
    }

    public TestPage open() {
        webDriver.navigate().to(pageUrl);
        return this;
    }

}
