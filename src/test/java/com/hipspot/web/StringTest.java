package com.hipspot.web;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        String list = "[3]";
        int end = list.length();
        String NumberList = list.substring(1, end-1);
        System.out.println("NumberList = " + NumberList);
        List<Integer> alist = new ArrayList<>();

        for(String s:NumberList.split(", ")) {
            System.out.println(s);
            alist.add(Integer.parseInt(s));
        }
        System.out.println(alist);
        

        
    }
}
