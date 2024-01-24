package com.myerp.HR.search;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myerp.HR.entity.Employee;

public interface SearchRepository extends JpaRepository<Employee, Integer> {

}