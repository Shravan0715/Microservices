package com.java.wipro.Task;

import java.util.List;

public class EmployeeManagementSystem {
	private List<Workable> employees;

    public EmployeeManagementSystem(List<Workable> employees) {
        this.employees = employees;
    }

    public void manageEmployees() {
        for (Workable emp : employees) {
            if (emp instanceof Employee) {
                ((Employee) emp).showDetails();
            }
            emp.performDuties();
            System.out.println("----------------------------");
        }
    }
}
