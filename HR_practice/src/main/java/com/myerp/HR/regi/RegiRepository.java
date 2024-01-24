package com.myerp.HR.regi;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myerp.HR.entity.Employee;

public interface RegiRepository extends JpaRepository<Employee, Integer> {

}
