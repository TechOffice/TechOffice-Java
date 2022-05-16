package com.techoffice.list;

import java.util.Arrays;
import java.util.List;

public class StreamCollectorExample {

    private static void testCase1(){
        String[] testingArr1 = {"123", "134", "145", "156", "167"};
        List<String> testingList = Arrays.asList(testingArr1);
        boolean result = testingList.stream().allMatch(item -> item != null && item.startsWith("1"));
        System.out.println("result: " + result);
    }

    private static void testCase2(){
        String[] testingArr1 = {"123", "134", "145", "156", "267"};
        List<String> testingList = Arrays.asList(testingArr1);
        boolean result = testingList.stream().allMatch(item -> item != null && item.startsWith("1"));
        System.out.println("result: " + result);
    }

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }
}