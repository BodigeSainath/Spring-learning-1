package com.springdemo.employee_formtagpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.javafx.sg.prism.NGShape.Mode;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model){
		Employee emp=new Employee();
		model.addAttribute("employee", emp);
		return "employee-form";
	}
	
	
	
//	(@ModelAttribute Employee employee){
//		return "employee-form";
//	}
	
}
