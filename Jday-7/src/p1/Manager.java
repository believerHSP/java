package p1;

public class Manager extends Member{
	
	String Specialisation;  
	String Department;
	
	
	
	public Manager(String name, int age, String phonenumber, String address, double salary){
		super(name, age, phonenumber, address, salary);
		
	}

	@Override
	public String toString() {
		return "Manager [Name=" + Name + ", Age=" + Age + ", Phonenumber=" + Phonenumber + ", Address=" + Address
				+ ", Salary=" + Salary + "]";
	}

	

}
