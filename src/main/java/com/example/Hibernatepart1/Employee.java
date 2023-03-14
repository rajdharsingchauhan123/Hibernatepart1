package com.example.Hibernatepart1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class Employee implements Serializable {
    private int id ;
    private String name;
    private int age;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Employee(){

    }
}
