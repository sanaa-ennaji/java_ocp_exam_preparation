package org.sanaa.preparation.ocp.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Collections {

    public static void main (String[] args){
        // 1:arrayList : Faster for searching, slower for insertions/removals
       List<String> list = new ArrayList<>();

       list.add("js");
       list.add("java");
       list.add("GO");

     for( String lang : list){
         System.out.println(lang);
     }

      System.out.println(list.get(2));


        // 2. TreeSet : implamant NavigableSet dont allow null and duplicate

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(9);
        numbers.add(1);
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());

    }




}
