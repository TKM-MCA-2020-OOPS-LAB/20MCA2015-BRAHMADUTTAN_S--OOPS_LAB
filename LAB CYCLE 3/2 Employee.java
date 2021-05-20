package co3;
import java.util.Scanner;

public class Employee {
	int Empid;
	String Name;
	double Salary;
	String Address;
	Scanner Empl=new Scanner(System.in);
	
	public Employee() 
	{
		System.out.println("Enter Employee id: ");
		Empid=Empl.nextInt();
		System.out.println("Enter Name: ");
		Name=Empl.next();
		System.out.println("Enter Salary: ");
		Salary=Empl.nextDouble();
		System.out.println("Enter Address: ");
		Address=Empl.next();
	}
}
class Teacher extends Employee
{
	String department;
	String subject;
	Scanner teach=new Scanner(System.in);
	
	public Teacher()
	{
		System.out.println("Enter department: ");
		department=teach.next();
		System.out.println("Enter Subject: ");
		subject=teach.next();
	}
	
	void display()
	{
		System.out.println("Enter Employee Details"); 
		System.out.println("Enter Employee id: "+Empid);
		System.out.println("Enter Employee Name: "+Name);
		System.out.println("Enter Employee Salary: "+Salary);
		System.out.println("Enter Employee Address: "+Address);
		System.out.println("Enter Teaching Department: "+department);
		System.out.println("Enter Teaching Subject: "+subject);
	}
	
	public static void main(String[] args) {
		int i,n;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of Employees to add: ");
	    n=input.nextInt();
		Teacher obj[]=new Teacher[n];
		for(i=0;i<n;i++) 
		{
			obj[i]=new Teacher();
		}
		for(i=0;i<n;i++) 
		{
			obj[i].display();
		}
		// TODO Auto-generated method stub

	}

}