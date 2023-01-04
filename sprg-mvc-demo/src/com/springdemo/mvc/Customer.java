package com.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springdemo.mvc.customvalidation.CourseCode;

//this is for valiatioon operatn test
public class Customer {

	private String firstName;
	@NotNull(message="can't bee null")
	@Size(min=1,message="can't ve null size")
	private String lastName;
	@NotNull(message="can't bee null")
	@Min(value=18,message=">=18")
	@Max(value=70, message="<=70")
	private Integer age; //video160 if this is hvg spaces initbinder will trim that wokrs as String so change to Integer
	@NotNull(message="can't bee null")
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="must be 5 char")
	private String pin;
	@CourseCode
	private String courseCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
