package com.java.wipro.Task;

public class SecurityGuard extends Employee implements Workable, Guardable {
	  private String shift;

	    public SecurityGuard(String name, int id, double salary, String shift) {
	        super(name, id, salary);
	        this.shift = shift;
	    }

	    @Override
	    public void performDuties() {
	        guard();
	    }

		@Override
		public void guard() {
			// TODO Auto-generated method stub
			System.out.println(name + " is guarding the premises during the " + shift + " shift.");
		}
}
