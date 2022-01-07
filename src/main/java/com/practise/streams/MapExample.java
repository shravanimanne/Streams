package com.practise.streams;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toyota","Hundai","Nissan","kia","Tesla");
        list.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);


    }
}