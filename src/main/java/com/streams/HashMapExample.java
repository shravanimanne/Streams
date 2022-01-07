package com.streams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer,String>();
        /*
        Adding elements into the map
         */
        hmap.put(1,"Tesla");
        hmap.put(2,"Toyota");
        hmap.put(3,"Nissan");
        hmap.put(4,"Hundai");
        hmap.put(5,"Maruthi");
        hmap.put(6,"kia");

        /*
        Displaying elements
         */
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry map = (Map.Entry)iterator.next();
            System.out.println("Key is "+map.getKey()+" value is "+map.getValue());

        }
    }
}
