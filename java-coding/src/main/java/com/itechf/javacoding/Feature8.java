package com.itechf.javacoding;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class Feature8 {
    
    private List<Integer> intList = List.of(1, 3, 5, 6, 12, 10);

    public void print() {
        // intList.forEach(System.out::println);
        patternDemo();
    }

    public void patternDemo() {
        int k = 1;
        for (int i = 0 ; i<=4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
