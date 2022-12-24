package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	//method to show form on page when showForm url hits
	@RequestMapping("/showForm") 
	public String showForm(){
		return "helloworld-view";
	}
	
	//to handle processForm call 
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	//Using Spring Model to add form data
	@RequestMapping("/processFormV2")
	public String usingSpringModelForForm(HttpServletRequest httpServletRequest,Model model){
		//read req param from html form
		String name=httpServletRequest.getParameter("studentName");
		name=name.toUpperCase();
		String res="Hello "+name;
				model.addAttribute("message",res);
	return "helloworld";
	}
	//@reqparam helps us to read form data from req server and bind automaticallly to thr variable
	@RequestMapping("/processFormV3ReqParam")
	public String usingSpringModelForForm(@RequestParam("studentName") String name,Model model){
		//read req param from html form
	//	String name=httpServletRequest.getParameter("studentName"); reqPar is dng this
		name=name.toUpperCase();
		String res="Hello "+name;
				model.addAttribute("message",res);
	return "helloworld";
	}
}
