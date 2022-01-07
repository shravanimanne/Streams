package com.streams;

import java.util.stream.*;



public class Example2 {
    public static void main(String[] args) {
        Stream.of("watermelon","apple", "orange", "pineapple")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
