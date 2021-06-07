package Arithmetic;
interface Calculation
{
    void Multiplication(int a,int b);
    void Division(float a,float b);
    void Addition(int a,int b);
    void Subtraction(int a,int b);

}
public class Operations implements Calculation
	{
	    public void Multiplication(int a,int b)
	    {
	        System.out.println(a+"x"+b+"="+(a*b));
	    }
	    public void Division(float a,float b)
	    {
			System.out.println(a+"/"+b+"="+(a/b));
	    }
	    public void Addition(int a,int b)
	    {
			System.out.println(a+"+"+b+"="+(a+b));
	    }
	    public void Subtraction(int a,int b)
	    {
	        System.out.println(a+"-"+b+"="+(a-b));
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
