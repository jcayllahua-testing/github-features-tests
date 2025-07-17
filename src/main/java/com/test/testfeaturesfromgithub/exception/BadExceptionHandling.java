package com.test.testfeaturesfromgithub.exception;

import org.springframework.stereotype.Component;

@Component
public class BadExceptionHandling {

    public void processData() {
        try {
            // Some risky operation
            int result = 10 / 0;
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }

    public void anotherMethod() {
        try {
            throw new RuntimeException("Test exception");
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }

    public void yetAnotherMethod() {
        try {
            String.valueOf(null).length();
        } catch (NullPointerException npe) {
        }
    }
}
