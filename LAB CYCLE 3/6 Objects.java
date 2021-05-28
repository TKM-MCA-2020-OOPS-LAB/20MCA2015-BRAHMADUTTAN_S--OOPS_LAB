package co3qn6;
import java.util.Scanner;

interface shapes
{
	void area();
	void perimeter();
}

class circle implements shapes
{
	int r ;
	double pi = 3.14,area,perimeter;
	
   public circle()
	{
   	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of circle: ");
		r = sc.nextInt();
	}
	public void area()
	{
		
		area = pi * r  *r;
		System.out.println("Area of circle with radius "+r+" is " + area);
		
	}
	public void perimeter()
	{
		perimeter = 2 * pi * r;
		System.out.println("Perimeter of circle with radius "+r+" is " + perimeter);
	}
}
class rectangle implements shapes
{
  int l ,b;
  int area,perimeter;
  
  public rectangle()
  {
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of rectangle: ");
		l = sc.nextInt();
		System.out.println("Enter Breadth of rectangle: ");
		b = sc.nextInt(); 
  }
   public void area()
   {
   	
		area = l *b;
		System.out.println("Area of rectangle is: " + area);
		
   }
   public void perimeter()
   {
   	perimeter = 2 *(l+b);
   	System.out.println("Perimeter of rectangle is: " + perimeter);
   }
}
public class Objects {

	public static void main(String[] args) {
		{
			int ch1,ch2;
			Scanner sc = new Scanner(System.in);
			System.out.println("Select a shape \n 1.Circle \n 2.Rectangle");
			System.out.println("Enter Your Choice : ");
			ch1 = sc.nextInt();
			switch(ch1)
			{
				case 1 : circle obj1 = new circle();
						System.out.println("Find \n1.Area \n2.Perimeter");
						System.out.println("Enter Your Choice : ");
						ch2 = sc.nextInt();
						switch(ch2)
						{
						case 1 : obj1.area();
									break;
						case 2 : obj1.perimeter();
						            break;
						default : System.out.println("Invalid choice");
						}
						break;
				
				case 2 :	rectangle obj2 = new rectangle();
							System.out.println("Find \n1.Area \n2.Perimeter");
							System.out.println("Enter Your Choice : ");
							ch2 = sc.nextInt();
							switch(ch2)
							{
							case 1 : obj2.area();
									break;
							case 2 : obj2.perimeter();
				            		break;
							default : System.out.println("Invalid choice");
							}
							break;
				default : System.out.println("Invalid choice");
				
			}
		// TODO Auto-generated method stub

	}

  }
}
