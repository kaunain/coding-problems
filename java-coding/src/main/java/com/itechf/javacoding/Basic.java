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
    
}
