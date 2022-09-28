package com.itechf.javacoding;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import org.springframework.stereotype.Component;

import com.itechf.javacoding.Four.Five;

@Component
public class Feature11 {

    public void run() {
        problem5();
    }

    public void problem5() {
        double a = 0.75;
        System.out.println(Math.round(a * 5));
    }

    public void problem8(int... a) {
        final Path path = Paths.get(".").normalize();
        int c = 0;
        for (int i = 0; i < path.getNameCount(); ++i) {
            c++;
        }
        System.out.println(c);
    }

    public void problem10(int... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void problem11() {
        // Four.Five f5 = four.new Five();
        // Five fi5 = new Five();
        Five five = new Four().new Five();

    }

    public void problem12() {
        var v1 = 10;
        var v2 = v1;
        var v3 = Math.pow(2, 3);
        // var v4 = null;
        // var v5 = (a,b) -> a+b;
        var v6 = List.of(12, "abc", 34.67d);

    }

    public int problem17() {
        int a = 1, b = 1;
        try {
            return a / b;
        } catch (ClassCastException e) {
            return 10;
        } catch (RuntimeException e) {
            return 20;
        } finally {
            return 30;
        }
        // Output 30
    }

    public void problem18() {
        Supplier<String> a = String::new;
        BiConsumer<String, String> x = (i, j) -> System.out.println(i);
        BiConsumer<String, String> y = (i, j) -> System.out.println(i);
        BiConsumer<String, String> b = x.andThen(y);
        UnaryOperator<String> c = n -> n + n;
    }

    public void problem20() {
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.removeIf((a) -> {
            int a1 = 10;
            return a != a1;
        });
        num.forEach((a) -> System.out.println(a));
        // Output 10
    }

    public void problem21() {
        int c = 1;
        if (c++ == 1 && c == 2)
            System.out.println("Yes : " + c);
        else
            System.out.println("No : " + c);
        // Output : Yes : 2
    }

    // problem 15
    public @interface Book {
        String[] cat();
    }

    public class One {
        @Book(cat = { "one", "two" })
        String fav;
        @Book(cat = { "one" })
        String coll;
        @Book(cat = "one")
        String oracle;

    }
}
