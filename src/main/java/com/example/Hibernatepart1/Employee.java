package com.example.Hibernatepart1;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    @Id
    @GenericGenerator(name = "emp_id ",strategy = " com.example.Hibernatepart1.CustomIdGen")
    @GeneratedValue(generator = "emp_id")
    private Integer id ;
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
