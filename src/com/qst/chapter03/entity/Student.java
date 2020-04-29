package com.qst.chapter03.entity;

public class Student {
	private String name;
	private String className;
	private int grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student() {
	}

	public Student(String name, String className, int grade) {
		this.className = className;
		this.name = name;
		this.grade = grade;
	}
	
	public void display() {
		System.out.println("Name:" + this.name);
		System.out.println("ClassName:" + this.className);
		System.out.println("Grade:" + this.grade);
	}
}
