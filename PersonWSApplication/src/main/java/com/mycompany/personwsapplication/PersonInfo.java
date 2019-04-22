/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.personwsapplication;

/**
 *
 * @author Администратор
 */
public class PersonInfo {
    private String name;
    private String position;
    private String age;
    private String salary;
	
	// Обязательный конструктор по умолчанию
	public PersonInfo() {}

	public PersonInfo(String name, String position, String age, String salary) {
		this.name = name;
		this.position = position;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
 
}
