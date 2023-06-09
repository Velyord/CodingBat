/*
Task:
    Given two strings, a and b, return the result of putting them together in the order abba, e.g.
    "Hi" and "Bye" returns "HiByeByeHi".

    makeAbba("Hi", "Bye") → "HiByeByeHi"
    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    makeAbba("What", "Up") → "WhatUpUpWhat"
 */
package Java.String1;

import static java.lang.System.out;

public class makeAbba {
    public static void main(String[] args) {
        out.println(makeAbba("Hi", "Bye"));
        out.println(makeAbba("Yo", "Alice"));
        out.println(makeAbba("What", "Up"));
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
