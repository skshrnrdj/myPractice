package com.myerp.HR.search;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myerp.HR.entity.Employee;

import lombok.RequiredArgsConstructor;

@RequestMapping("/employee")
@RequiredArgsConstructor
@Controller
public class SearchController {
	
	private final SearchService searchService;
	
    @GetMapping("/search")
    public String search(Model model, @RequestParam(value = "page", defaultValue = "0") int page) {
        Page<Employee> paging = this.searchService.getList(page);
        model.addAttribute("paging", paging);
        return "HR_search";
    }
}
