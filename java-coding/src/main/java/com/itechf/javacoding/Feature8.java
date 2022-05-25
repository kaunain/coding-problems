package com.itechf.javacoding;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Feature8 {
    
    private List<Integer> intList = List.of(1, 3, 5, 6, 12, 10);

    public void print() {
        // System.out.println(intList);
        intList.forEach(System.out::println);
    }
}
