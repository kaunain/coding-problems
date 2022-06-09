package com.itechf.javacoding;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable {
    private Integer id;
    private String name;
    volatile private String nickName;
    private Integer salary;

}
