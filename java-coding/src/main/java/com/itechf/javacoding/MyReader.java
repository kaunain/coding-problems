package com.itechf.javacoding;

import java.io.Closeable;

public class MyReader implements Closeable {

    private String text = "Hi This is Test";

    public String read() {
        System.out.println(text);
        return text;
    }

    @Override
    public void close() {
        System.out.println("Connection Closed");
    }
    
}
