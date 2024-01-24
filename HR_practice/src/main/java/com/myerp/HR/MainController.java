package com.myerp.HR;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
    @GetMapping("/employee")
    public String main() {
    	
        return "HR_main";
    }
}
