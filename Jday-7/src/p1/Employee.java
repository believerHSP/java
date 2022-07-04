package p1;

public class Employee extends Member {
	
	String Specialisation;  
	String Department;
	
	public Employee(String name, int age, String phonenumber, String address, double salary) {
		super(name, age, phonenumber, address, salary);
	}

	@Override
	public String toString() {
		return "Name=" + Name + ", Age="
				+ Age + ", Phonenumber=" + Phonenumber + ", Address=" + Address + ", Salary=" + Salary + "";
	}

   
	

}
