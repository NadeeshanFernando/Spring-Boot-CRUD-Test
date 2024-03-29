package com.anton.crud.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor
@Entity
@ToString
@Table (name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @JsonIgnore
    public  long employeeId;

    @Column(name = "empName")
    public String empName;

    @Column(name = "empPassword")
    public String empPassword;

    @Column(name = "empAge")
    public int empAge;

    @Column(name = "empSalary")
    public double empSalary;

    @OneToMany(mappedBy = "employee")
    @JsonIgnoreProperties("employee")
    private Set<Contact> contactList;

}
