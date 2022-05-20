package com.itechf.javacoding;

import org.springframework.stereotype.Component;

/**
 * How to reverse a String in Java?
 */

 @Component
public class Basic {

    public String reverseString(String input) {
        StringBuilder output = new StringBuilder();
        if(input == null)
            return output.toString();

        for (int i = input.toCharArray().length -1 ; i >= 0; i--) {
            output.append(input.toCharArray()[i]);
        }
        System.out.println(input);
        return output.toString();
    }
    
}
