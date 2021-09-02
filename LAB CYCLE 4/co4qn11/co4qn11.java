//Program to remove all the elements from a linked list
package co4;
import java.util.LinkedList;
import java.util.Scanner;

public class co4qn11 {
	public static void main(String[] args) {
	      int n;
	      String data;
	      LinkedList<String> ll = new LinkedList<String>();
	      System.out.println("Enter the number of data");
	      Scanner sc = new Scanner(System.in);
	      n = sc.nextInt();
	      System.out.println("Enter the data");
	      sc.nextLine();
	      for(int i=0;i<n;i++)
	      {
	          data = sc.nextLine();
	          ll.add(data);
	      }
	      System.out.println("LinkedList: "+ll);
	      System.out.println("All the elements removed from Linked list");
	      ll.clear();
	      System.out.println(ll);
}
}