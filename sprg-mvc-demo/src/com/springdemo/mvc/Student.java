package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
private String firstName,lastName,country,lang;
private String[] course;
private LinkedHashMap<String, String> countries;
public Student(){
	countries= new LinkedHashMap<>();
	countries.put("IN", "India");
	countries.put("US", "United States");
}
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
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public LinkedHashMap<String, String> getCountries() {
	return countries;
}
public String getLang() {
	return lang;
}
public void setLang(String lang) {
	this.lang = lang;
}
public String[] getCourse() {
	return course;
}
public void setCourse(String[] course) {
	this.course = course;
}

}
