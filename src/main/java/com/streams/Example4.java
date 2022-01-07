package com.streams;

import java.util.Arrays;
import java.util.stream.*;
/*
Average of squares of aan integer
 */
class Example4 {
    public static void main(String[] args) {
        int array[] = {2,4,6,8,};
        Arrays.stream(array)
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);
    }
}
