package co2;
import java.util.Scanner;

public class array_search {

	public static void main(String[] args) {
		int n, x, flag = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search:");
        x = sc.nextInt();
        sc.close();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
               
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
	}
	// TODO Auto-generated method stub
}