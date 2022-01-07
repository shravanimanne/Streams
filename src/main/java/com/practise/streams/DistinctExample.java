package com.practise.streams;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,6,8,2,1,5);
        list.stream()
                .distinct()
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toList());


    }
}