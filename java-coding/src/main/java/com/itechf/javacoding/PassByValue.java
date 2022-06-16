package com.itechf.javacoding;

public class PassByValue {
    private String attribute;

    public PassByValue(String a) {
        this.attribute = a;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void changeReference(PassByValue a) {
        PassByValue b = new PassByValue("b");
        a = b;
    }

    public void modifyReference(PassByValue c) {
        c.setAttribute("c");
    }

    @Override
    public String toString() {
        return "{" +
            " attribute='" + getAttribute() + "'" +
            "}";
    }
    
}
