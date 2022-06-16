package com.itechf.javacoding;

public class Animal implements Moveable, Crawlable 
{

    @Override
    public void run() {
        Moveable.super.run();
    }
    Animal() {
        System.out.println("This is animal");
    }
    Animal(int num) {
        System.out.println("This is animal");
    }
}