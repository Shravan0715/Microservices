package com.java.wipro.Task;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementTest {
	public static void main(String[] args) {
        List<Workable> employees = new ArrayList<>();

        employees.add(new Manager("Shravan", 101, 80000, 10));//manager
        employees.add(new Developer("Shivu", 102, 60000, "Java"));//developer
        employees.add(new Developer("Shimba", 105, 50000, "C#"));//developer
        employees.add(new SecurityGuard("Shree", 103, 30000, "Night"));//securityguard
        employees.add(new SecurityGuard("Shivam", 104, 25000, "Morning"));
        
        
        EmployeeManagementSystem managementSystem = new EmployeeManagementSystem(employees);
        managementSystem.manageEmployees();
    }
}
