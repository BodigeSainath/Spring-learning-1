package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model){

		Student s=new Student();
		model.addAttribute("student",s);
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student stu){
		System.out.println("Studnt details are \n"+"Firstname "+stu.getFirstName()+" lastname "+stu.getLastName());
	return "student-confirm";
	}
}
