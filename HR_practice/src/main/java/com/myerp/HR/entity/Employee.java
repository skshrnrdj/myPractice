package com.myerp.HR.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "Employee_ID")
    private Long employeeId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Start_Date")
    private Date startDate;

    @Column(name = "Dept_Name")
    private String deptName;

    @Column(name = "Position")
    private String position;

    @Column(name = "Email")
    private String email;

    @Column(name = "Bank_Num")
    private String bankNum;

    @Column(name = "Regular_Pay")
    private double regularPay;

    // Constructors, getters, and setters
}