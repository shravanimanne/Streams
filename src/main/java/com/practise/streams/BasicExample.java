package com.practise.streams;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class BasicExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toyota","Hundai","Nissan","kia","Tesla");
        list.stream()
                    .filter(x-> x.startsWith("H"))
                    .forEach(System.out::println);


    }
}
