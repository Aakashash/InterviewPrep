package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int j=1;
        int i=10;

        // loop which never ends so be careful

        String [] array = new String[10];

        array = new String[]{"first ", "second "};

//        while (j>=0)
//        {
//            if(i>0)
//            System.out.println("continours loop");
//        }
        System.out.println(array[0]);

         Arrays.stream(array).filter(n-> n =="rasks").forEach(System.out::println);

         Arrays.stream(array).map(n-> n.concat("ram")).forEach(System.out::println);
    }
}



