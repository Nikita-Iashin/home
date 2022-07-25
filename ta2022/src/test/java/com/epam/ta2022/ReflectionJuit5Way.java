package com.epam.ta2022;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(AnnotationReflection.class)
public class ReflectionJuit5Way {

    @NamedCustom
    @Test
    public void someMethodTest() {

        System.out.println("""
                checking junit5 DI using Extension + Reflection
                +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                """);
    }
}
