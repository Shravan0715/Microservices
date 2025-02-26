package com.s;

public class EmpDetails {
	Employee employee;
	
	public double calculateBonus() {
		double bonusSalary= employee.Salary * 0.25;
		return bonusSalary;
	}
	
	public void PrintEmployeeDetails() {
		System.out.println("Emp ID: "+employee.EmpId);
		System.out.println("Employee Name : "+employee.Ename);
		System.out.println("Employee Salary : "+employee.Salary);
		System.out.println("Bonus Salary :"+calculateBonus());
		
		
	}
}
