package com.springdemo.formtags;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/showForm")
	private String showForm(Model model){
		Employee e=new Employee();
		model.addAttribute("employee",e);
		return "employee-form";
	}
	@RequestMapping("/processForm")
	private String processForm(@ModelAttribute("employee") Employee employee){
		return "employee-confirm";
	}
}
