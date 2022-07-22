package com.epam.ta2022;

import com.epam.ta2022.pages.GooglePage;
import com.epam.ta2022.pages.TestPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Ta2022ApplicationTests {

    @Autowired
    private TestPage testPage;
    @Autowired
    private GooglePage googlePage;

    @Test
    void openTestPage() {
        String title = testPage.open().getTitle();

    }

    @Test
    void checkGoogleLabel() {
        googlePage
                .open()
                .isGoogleLogoExist();
    }

}
