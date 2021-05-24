package co3qn3;

import java.util.Scanner;

class Person 
{
	String Name;
	String Gender;
	String Address;
	int Age;
	Scanner pe=new Scanner(System.in);
	
	public Person() {
		System.out.println("\n\n");
		System.out.println("Enter Person Name: ");
		Name=pe.next();
		System.out.println("Enter Gender: ");
		Gender=pe.next();
		System.out.println("Enter Address: ");
		Address=pe.next();
		System.out.println("Enter Age: ");
		Age=pe.nextInt();
	}
}
class Employee extends Person
{
	int Empid;
	String Com_name;
	String Emp_quali;
	double Emp_salary;
	Scanner emp=new Scanner(System.in);
	
	public Employee()
	{
		System.out.println("Enter Employee Id: ");
		Empid=emp.nextInt();
		System.out.println("Enter Company Name: ");
		Com_name=emp.next();
		System.out.println("Enter Employee Qualification: ");
		Emp_quali=emp.next();
		System.out.println("Enter Employee Salary: ");
		Emp_salary=emp.nextDouble();
	}
}
class teacher extends Employee
{
	int TeacherId;
	String department;
	String subject;
	Scanner te=new Scanner(System.in);
	
	public teacher()
	{
		System.out.println("Enter Department: ");
		department=te.next();
		System.out.println("Enter Teacher Id: ");
		TeacherId=te.nextInt();
		System.out.println("Enter Subject: ");
		subject=te.next();
	}
	
	public void display()
	{
		System.out.println("\nDetails of Teacher Id with "+TeacherId);
		System.out.println("Name : "+Name);
		System.out.println("Gender : "+ Gender);
		System.out.println("Address: "+Address);
		System.out.println("Age: "+Age);
		System.out.println("Employee id: "+Empid);
		System.out.println("Company Name: "+Com_name);
		System.out.println("Qualification: "+Emp_quali);
		System.out.println("Salary: "+Emp_salary);
		System.out.println("Department: "+department);
		System.out.println("Subject: "+subject);
		System.out.println("\n");
		
	}
}
public class Inheritance2
{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Teachers: ");
		n=sc.nextInt();
		
		teacher obj[]= new teacher[n];
		for(int i=0;i<n;i++)
		{
		obj[i]=new teacher();
		}
		for(int i=0;i<n;i++)
		{
		System.out.println("\nDetails of Employees: "+(i+1));
		obj[i].display();
		sc.close();
		}
	}
 
}
