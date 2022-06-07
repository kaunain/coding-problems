package com.itechf.javacoding;

import org.springframework.stereotype.Component;

/**
 * How to reverse a String in Java?
 */

 @Component
public class Basic {

    //How to reverse a String in Java?
    public String reverseString(String input) {
        StringBuilder output = new StringBuilder();
        if(input == null)
            return output.toString();

        for (int i = input.toCharArray().length -1 ; i >= 0; i--) {
            output.append(input.toCharArray()[i]);
        }
        System.out.println(output);
        return output.toString();
    }

    //Java program to check if the given number is Prime?
    public Boolean isPrime(Integer input) {
        Boolean output = false;

        if(input == 0 || input == 2)
            return output;

        output = true;

        if(input == 1)
            return output;

        for (int i = 2; i <= input / 2; i++) {
            if(input % i == 0) 
                return false;
        }

        System.out.println(output);
        return output;
    }
    
    //swap two string variable without using third variable
    public void swapTwoString() {
        String s1 = "Hello7";
        String s2 = "Java2";

        System.out.println("Before swap s1 : " + s1 + " | s2 : " + s2);
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("After swap s1 : " + s1 + " | s2 : " + s2);
    }

    public void multipleInheritance() {
        School sc = new School();
        sc.print();
        System.out.println("----");
        Student st = new School();
        st.print();
        System.out.println("----");
        Teacher te = new School();
        te.print();
        System.out.println("----");
        Teacher te2 = () -> System.out.println("This is use of lambda");
        te2.print();
        System.out.println("----");
        Teacher te3 = System.out::println;
        te3.print();
        System.out.println("----");
        
    }
    public void finalVariable() {
        final String name = "One";
        System.out.println(name);
        StringBuffer sb = new StringBuffer("Two");
        System.out.println(sb);
        sb.append("Three");
        System.out.println(sb);
    }
}
