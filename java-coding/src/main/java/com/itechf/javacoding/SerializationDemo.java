package com.itechf.javacoding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class SerializationDemo {
    public void write () throws IOException {
        Employee emp = new Employee(1, "Amit", "Kalu", 1000, EmployeeType.FULL_TIME);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/home/ahmad/logs/emp.txt")));
        oos.writeObject(emp);
        oos.flush();
        oos.close();
    }
    public void reader () throws ClassNotFoundException, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/home/ahmad/logs/emp.txt")));
        Employee emp = (Employee) ois.readObject();
        System.out.println(emp);
    }
}
