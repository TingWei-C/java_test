package com.qst.chapter05.aggregation;

public class Department {
	Employee[] emps;

	public Department(Employee[] emps) {
		this.emps = emps;
	}

	public void show() {
		for (Employee emp : emps) {
			System.out.println(emp.name);
		}
	}
}
