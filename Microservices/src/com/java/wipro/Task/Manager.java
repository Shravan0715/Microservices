package com.java.wipro.Task;

public class Manager extends Employee implements Workable,Manageable {
	 private int teamSize;

	    public Manager(String name, int id, double salary, int teamSize) {
	        super(name, id, salary);
	        this.teamSize = teamSize;
	    }

	    @Override
	    public void performDuties() {
	       manageteam();
	    }

		@Override
		public void manageteam() {
			// TODO Auto-generated method stub
			 System.out.println(name + " is managing a team of " + teamSize + " employees.");
		}
}
