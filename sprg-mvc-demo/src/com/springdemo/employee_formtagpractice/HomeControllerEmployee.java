package com.springdemo.employee_formtagpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerEmployee {

	@RequestMapping("/(")
	public String showForm(){
		return "employee-main";
	}
}
