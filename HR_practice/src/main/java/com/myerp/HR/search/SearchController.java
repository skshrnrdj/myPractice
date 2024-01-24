package com.myerp.HR.search;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.myerp.HR.entity.Employee;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class SearchController {
	
	private final SearchService searchService;
	
    @GetMapping("/employee/search")
    public String search(Model model) {
        List<Employee> employeeList = this.searchService.getList();
        model.addAttribute("employeeList", employeeList);
        return "HR_search";
    }
}
