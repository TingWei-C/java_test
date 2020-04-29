package com.qst.chapter05.aggregation;

public class AggregationDemo {

	public static void main(String[] args) {
		Employee[] emps = { new Employee("William"), new Employee("Sharon"), new Employee("Ruyn"),
				new Employee("Justin"), };
		Department dep = new Department(emps);
		dep.show();
	}
}
