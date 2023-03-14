package com.example.Hibernatepart1;


import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int id ;
    @Column
    private String name;
    @Column
    private int age;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Employee(){

    }
}
