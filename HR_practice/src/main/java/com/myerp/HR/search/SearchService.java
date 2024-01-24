package com.myerp.HR.search;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myerp.HR.entity.Employee;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SearchService {

    private final SearchRepository searchRepository;

    public List<Employee> getList() {
        return this.searchRepository.findAll();
    }
}
