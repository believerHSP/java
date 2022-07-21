package p2;

import java.util.Scanner;

public class Main {

	
	public static Employee getEmployeeDetails(String name,int id,double salary,double net) {
		Employee e1=new Employee();
		e1.setEmployeeId(id);
		e1.setEmployeeName(name);
		e1.setSalary(salary);
		e1.setNetSalary(net);
		return e1;
	}
	
	public static int getPFPercentage(int pf) {
		
		return pf;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the Employee details");
		String name=sc.next();
		int id=sc.nextInt();
		double salary=sc.nextInt();
		double net=sc.nextInt();
		
		Employee e=Main.getEmployeeDetails(name,id,salary,net);
		
		System.out.println("enter the pfPercentage");
		int pf=sc.nextInt();
		
		int Pf=Main.getPFPercentage(pf);
		
		e.calculateNetSalary(Pf);
		
		int a=e.getEmployeeId();
		String b=e.getEmployeeName();
		double c=e.getNetSalary();
		System.out.println(a+b+c);
	}
}
