package com.practice.chrome;

import signup.ChromeSignUpTest;

public class SignUpTest {
    public static void main(String[] args) {
        try {
            ChromeSignUpTest.test();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
