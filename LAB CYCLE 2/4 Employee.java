package co2;
import java.util.Scanner;
public class Employee {
	int eNo;
	String eName;
	double eSalary;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Id ");
		eNo=sc.nextInt();
		System.out.println("Enter Employee Name");
		eName=sc.next();
		System.out.println("Enter Employee Salary");
		eSalary=sc.nextDouble();
	}
	void display()
	{
		System.out.println("Employee id is : "+ eNo);
		System.out.println("Employee name is : "+ eName);
		System.out.println("Employee salary is : "+ eSalary);
	}
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int i,n,c,f=0;
		System.out.println("Enter the number of Employees");
		n=sc1.nextInt();
		Employee e[]=new Employee[n];
		for(i=0;i<n;i++) {
			e[i]=new Employee();
			e[i].getdata();
		}
		System.out.println("Employee details are :\n");
		for(i=0;i<n;i++) {
			e[i].display();
		}
		System.out.println("\nEnter id of Employee to search: ");
		c=sc1.nextInt();
		for(i=0;i<n;i++) {
		if(c==e[i].eNo) {
			f=1;
			break;
		}
	}
	if(f==1) {
		System.out.println("Details of employee is ");
		e[i].display();
	}
	else
		System.out.println("Employee Id is Invalid");	

	}
		// TODO Auto-generated method stub

	

}