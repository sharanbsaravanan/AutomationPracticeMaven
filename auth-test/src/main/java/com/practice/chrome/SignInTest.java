package com.practice.chrome;

import signin.ChromeSignInTest;

public class SignInTest {
    public static void main(String[] args)  {
        try {
            ChromeSignInTest.test();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
