package com.techoffice.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArrayList is Resizable-array Implementation of List.
 *
 */
public class ArrayListExample {

    public static void newArrayList(){
        List<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        for (String item: items){
            System.out.println("Items");
        }
    }

    public static void initialSize(){
        List<String> items = new ArrayList<>(1);
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        for (String item: items){
            System.out.println("Items");
        }
    }

    public static void arraysAsLitTest(){
        List<String> items = Arrays.asList("Item 1", "Item 2", "Item 3");
        items.add("Item 4");
        items.add("Item 5");
    }

    public static void main(String[] args){
        newArrayList();
        initialSize();
        arraysAsLitTest();
    }
}
