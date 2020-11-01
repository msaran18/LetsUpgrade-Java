import java.util.Scanner;

public class Employee {

	String name,designation;
	int age;
	double salary;
	// name, age, salary,
	// designation, and methods to get details and display details.
	Scanner sc=new Scanner(System.in);
	public void getDetail()
	{
		System.out.println("Enter Name:");
		name=sc.nextLine();
		
		System.out.println("Enter Age:");
		age=sc.nextInt();
		
		System.out.println("Enter your Salary");
		salary=sc.nextDouble();
		
		System.out.println("Enter your Designation");
		designation=sc.next();
	}
	public void displayDetail()
	{
		System.out.println("Hello "+name+", your age is"+age+", salary is"+salary+" and designation is "+designation);
		
	}
}
