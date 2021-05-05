package Complex_numbers;

public class Complex {
	double real;
	double img;
	
	 
	   Complex(double r, double i){
		this.real = r;
		this.img = i;
	   }
		
	   public static Complex sum(Complex c1,Complex c2)
	   {
		
		   Complex temp = new Complex(0, 0);

	        temp.real = c1.real + c2.real;
	        temp.img = c1.img + c2.img;
	        return temp;
	    }
	public static void main(String[] args) {
		Complex c1 = new Complex(8.2, 6);
		Complex c2 = new Complex(6.5, 3.7);
	        Complex temp = sum(c1, c2);
	        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
		// TODO Auto-generated method stub

	}

}