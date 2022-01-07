package com.streams;

import java.util.Arrays;
import java.util.stream.*;

public class Example3 {
    public static void main(String[] args) {
        String array[] = {"z","s","shravs","d","x","b","shs", "sgjnvckdnvkd"};
        Arrays.stream(array)
                .filter(x -> x.startsWith("s"))
                .sorted()
                .forEach(System.out::println);

    }
}