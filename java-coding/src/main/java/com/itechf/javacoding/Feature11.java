package com.itechf.javacoding;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Feature11 {

    public void run() {
        problem20();
    }

    public void problem20() {
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.removeIf((a) -> {int a1 = 10 ; return a != a1;});
        num.forEach((a) -> System.out.println(a));
    }
    
    public void problem21() {
        int c =1;
        if(c++ == 1 && c == 2)
            System.out.println("Yes : " + c);
        else
            System.out.println("No : " + c);
    }
    
}
