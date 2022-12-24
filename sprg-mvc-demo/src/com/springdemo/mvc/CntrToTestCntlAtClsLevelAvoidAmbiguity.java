package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CntrToTestCntlAtClsLevelAvoidAmbiguity {

	@RequestMapping("/showForm")
	public String showsForm(){
		return "dummy";
	}
}
