package com.java.wipro.Task;

public class Developer extends Employee  implements Workable, Codeable{
	 private String programmingLanguage;

	    public Developer(String name, int id, double salary, String programmingLanguage) {
	        super(name, id, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	    @Override
	    public void performDuties() {
	        writecode();
	    }

		@Override
		public void writecode() {
			// TODO Auto-generated method stub
			System.out.println(name + " is writing code in " + programmingLanguage + ".");
		}
}
