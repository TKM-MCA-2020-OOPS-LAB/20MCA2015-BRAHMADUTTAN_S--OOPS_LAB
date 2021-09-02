//Program to demonstrate the creation of queue object using the PriorityQueue class
package co4;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class co4qn13 {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of elements ");
		int n=sc.nextInt();
		System.out.println("Enter the elements ");
		for(int i =0;i<n;i++)
		{
			String st=sc.next();
			pq.add(st);
	 
		}
		System.out.println("Iterating the queue elements\n ");  
		Iterator<String> itr=pq.iterator(); 
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		pq.remove();  
		pq.poll();  
		System.out.println("After removing two elements \n");  
		Iterator<String> itr2=pq.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
	} 
}