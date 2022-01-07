package com.practise.streams;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

public class LimitExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toyota1","Hundai4","Nissan","kia","Tesla");
        list.stream()
                .map(String::toLowerCase)
                .count();


    }
}