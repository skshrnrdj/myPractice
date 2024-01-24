package com.myerp.HR.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.myerp.HR.entity.Employee;

public interface SearchRepository extends JpaRepository<Employee, Integer> {
	Page<Employee> findAll(Pageable pageable);
}