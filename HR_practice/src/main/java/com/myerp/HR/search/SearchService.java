package com.myerp.HR.search;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    
    public Page<Employee> getList(int page) {
        Pageable pageable = PageRequest.of(page, 10);
        return this.searchRepository.findAll(pageable);
    }
}
