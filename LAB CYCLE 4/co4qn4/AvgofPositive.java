import java.util.Scanner;
class NegativeIntException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeIntException(String s)
	{
		super(s);
	}
}
public class AvgofPositive {

	public static void main(String[] args) {
		int n,i;
		int sum=0;
	    int num[];
	    float avg,count=0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the total number to find average:");
	    n = sc.nextInt();
	    num = new int[n];
	    System.out.println("Enter the numbers:");
	    for(i=0;i<n;i++)
	    {
	        num[i] = sc.nextInt();
	    }
	    for(i=0;i<n;i++) {
	    	try {
		    	if(num[i]<0)
		    	{
		    		throw new NegativeIntException("Entered numbers must positive");
		    	}
		    	else 
		    	{
			      sum = sum + num[i];
			      count++;
		    	}
		    }
	    	catch(NegativeIntException e) {
	    		System.out.println("Exception Occurred..... "+e);
	    	}
	    }
	    avg=sum/count;
	    System.out.println("Average :"+avg);
	    
		// TODO Auto-generated method stub
		
	}

}
