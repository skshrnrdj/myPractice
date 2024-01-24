package com.myerp.HR.regi;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class RegiController {
	
	private final RegiService regiService;
	
    @GetMapping("/employee/regi")
    public String regi() {
    	
        return "HR_regi";
    }
    
    @PostMapping("/employee/regi")
    public String registerEmployee(
            @RequestParam(name = "employeeId") Long employeeId,
            @RequestParam(name = "name") String name,
            @RequestParam(name = "startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam(name = "deptName") String deptName,
            @RequestParam(name = "position") String position,
            @RequestParam(name = "email") String email,
            @RequestParam(name = "bankNum") String bankNum,
            @RequestParam(name = "regularPay") int regularPay) {
    	
    	this.regiService.regi(employeeId, name, startDate, deptName, position, email, bankNum, regularPay);
    	
    	return "HR_search";
    }
}
