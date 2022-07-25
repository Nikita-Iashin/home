package com.epam.ta2022;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

import java.lang.reflect.Method;

public class AnnotationReflection implements TestInstancePostProcessor {
    @Override
    public void postProcessTestInstance(Object o, ExtensionContext extensionContext) throws Exception {
        Method[] methods = o.getClass().getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(NamedCustom.class)) System.out.println(m.getName());
        }
    }
}
