package com.itechf.javacoding;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Noida(val = "hi")
public class Employee implements Serializable {
    private Integer id;

    private String name;
    volatile private String nickName;
    private Integer salary;
    private EmployeeType empType;

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

}
interface Moveable
{
    default void run(){
        System.out.println("I am running, kid !!");
    }
}
  
interface Crawlable
{
    default void run(){
        System.out.println("I am running, daddy !!");
    }
}