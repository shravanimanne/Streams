package com.streams;

import java.util.stream.*;



public class StreamsExample {
    public static void main(String[] args) {
        /*
        Creating integer stream
        */
        //IntStream
        //   .range(1,10).skip(4)
        // .forEach(System.out::println);
        // System.out.println();

        System.out.println(
        IntStream
                .range(1, 10)
                .sum());




    }
}
