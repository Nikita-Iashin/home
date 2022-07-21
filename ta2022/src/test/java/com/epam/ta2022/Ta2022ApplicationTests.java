package com.epam.ta2022;

import com.epam.ta2022.pages.GoogleSearchPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ta2022ApplicationTests {

    @Autowired
    private GoogleSearchPage googleSearchPage;

    @Test
    void openGoogleSearch() {
        googleSearchPage.open();
    }

}
