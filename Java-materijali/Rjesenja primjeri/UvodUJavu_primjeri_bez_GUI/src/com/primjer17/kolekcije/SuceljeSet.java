package com.primjer17.kolekcije;

import java.util.*;

public class SuceljeSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
        set.add(1);
        set.add(500);
        set.add(2);
        set.add(400);
        set.add(10);
        // set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.remove(400));
        
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {            
            System.out.println(iterator.next());
        }
        
        Set<Integer> set2 = new HashSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        
        // unija
        //set.addAll(set2);
        // razlika
        //set.removeAll(set2);
        // presjek
        //set.retainAll(set2);
        //podskup skupa
        System.out.println(set.containsAll(set2));
        System.out.println(set);
    }

}
