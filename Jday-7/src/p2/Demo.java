package p2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("no of student objects");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Student[] st=new Student[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.println("enter rollno");
			int roll=sc.nextInt();
					
			System.out.println("name");
			String name=sc.next();
					
			System.out.println("address");
		    String address=sc.next();
					
			System.out.println("marks");
		    int marks=sc.nextInt();
					
			Student stud = new Student(roll,name,address,marks);
			st[i]=stud;
			
		}
		int sum=0;
		
		for( Student value: st) {
			System.out.println(value.roll);
			System.out.println(value.name);
			System.out.println(value.address);
			System.out.println(value.marks);
			sum=sum+value.marks;
			
			
		}
		float avg=sum/n;
		System.out.println(avg);
		System.out.println("-------------");

	}
}
