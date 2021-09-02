//Program to demonstrate the creation of Set object using the LinkedHashset class
package co4;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class co4qn15 {
	public static void main(String[] args) {

		LinkedHashSet<String> s = new LinkedHashSet<String>();
		int n;
		String x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements to be added: ");
		n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter set elements: ");
		for(int i=0;i<n;i++)
		{
			x=sc.nextLine();
			s.add(x);
		}
		System.out.println("Displaying LinkedHashSet:"+s);
		System.out.println("Size of LinkedHashSet: "+s.size());
		System.out.println("Enter element to be deleted:");
		String d=sc.nextLine();
		
		if(s.remove(d))
		{
			System.out.println("Set after removal:"+s);
		}
		else
		{
			System.out.println("Element not found!!");
		}
	}
}
