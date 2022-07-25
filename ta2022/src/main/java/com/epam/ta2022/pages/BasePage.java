package com.epam.ta2022.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public abstract class BasePage {

    @Autowired
    protected WebDriver driver;

    @PostConstruct
    private void init(){
        PageFactory.initElements(driver, this);
    }
}
