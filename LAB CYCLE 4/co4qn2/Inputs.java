import java.util.Scanner;

import Arithmetic.Operations;
public class Inputs {
	
	public static void main(String[] args) {
		int a,b;
		int ch;
		Operations obj=new Operations();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 numbers:");
	      a=sc.nextInt();
	      b=sc.nextInt();
	    System.out.println("\n1.Multiplication\n2.Division\n3.Addition\n4.Substraction\n");
	    System.out.println("Enter the choice:\n");  
	    ch = sc.nextInt();
	    switch(ch)
        {
            case 1:obj.Multiplication(a,b);
                    break;
            case 2:obj.Division(a,b);
                    break;
            case 3:obj.Addition(a,b);
                    break;
            case 4:obj.Subtraction(a,b);
                    break;
            default:System.out.println("Invalid choice");
        }
	    sc.close();
		// TODO Auto-generated method stub

	}

}
