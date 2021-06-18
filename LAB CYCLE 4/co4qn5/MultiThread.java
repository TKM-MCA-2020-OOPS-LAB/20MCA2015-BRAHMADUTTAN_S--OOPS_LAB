import java.util.Scanner;
public class MultiThread {
	public static void main(String[] args)throws InterruptedException 
	{
		ThreadMul a=new ThreadMul();
        a.start();
        Thread.sleep(200);
        ThreadPrime b=new ThreadPrime();
        b.start();
        Thread.sleep(200);

		// TODO Auto-generated method stub

	}
}
class ThreadMul extends Thread
{
	public void run()
    {
        int n=5;
        System.out.println("Multiplication table Of 5\n");
        System.out.println("**************************\n");
        for(int i=1;i<=10;i++)
        {
            
            System.out.println("\t"+n+"x"+i+"="+n*i);
        }
        System.out.println("\n**************************\n");
    }
}
class ThreadPrime extends Thread
{
	public void run()
    {
        int i,count,j,limit;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit to find the Prime Numbers:");
        limit = s.nextInt();
        System.out.println("Prime numbers between 1 and " + limit + " are:");
        for(i=1;i<=limit;i++)
        {
        	count=0;
        	for(j=1;j<=i;j++)
        	{
        		if(i%j==0)
        		{
        			count++;
                }
        	}
        	if(count==2)
        	{
        		System.out.println(i);
        	}
        }

    }
}
