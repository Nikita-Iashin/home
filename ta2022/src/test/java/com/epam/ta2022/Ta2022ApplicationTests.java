package com.epam.ta2022;

import com.epam.ta2022.pages.GooglePage;
import com.epam.ta2022.pages.TestPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;


/**
 * set spring.profiles.active=qa to run Yandex instead Google, so the checkGoogleLabel() will fail(see profiles )
 */
@SpringBootTest
@Profile("!qa")
class Ta2022ApplicationTests {

    @Autowired
    private TestPage testPage;
    @Autowired
    private GooglePage googlePage;




    @Test
    @Deprecated
    void openTestPage() {
        String title = testPage.open().getTitle();
        //multi line block
        //null pointer flag
        String flagForNullPointer = """
                need to pass -XX:+ShowCodeDetailsInExceptionMessages JVM flag 
                to enable this feature while running the application.\s
                """;
        //instanceof
        if (title instanceof String) {
            System.out.println("There is a new instanceof construction in Java 14");
        }

    }


    //an immutable data carrier
    record SomeRecord(String title) {

    }

    private enum Day {
        MON, TUE, WED, THUR, FRI, SAT, SUN
    }

    public static Boolean isWeekDay(Day day) {
        Boolean result = switch (day) {
            case MON, TUE, WED, THUR, FRI -> {
                System.out.println("It is WeekDay");
                yield true;
            }
            case SAT, SUN -> {
                System.out.println("It is Weekend");
                yield false;
            }
        };
        return result;
    }

    @Test
    void checkGoogleLabel() {
        googlePage
                .open()
                .isGoogleLogoExist();
    }

}
