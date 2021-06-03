import Graphics.Shapes;
import java.util.Scanner;

public class Area 
{
	public static void main(String[] args)
	{
		int ch;
		float Rec_len,Rec_br;
		float Tri_ba,Tri_hei;
		float side;
		float r;
		Shapes obj=new Shapes();
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Select a shape \n 1.Rectangle \n 2.Triangle \n 3.Square \n 4.Circle\n");
			System.out.println("Enter Your Choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1 : System.out.println("Enter the Length:");
                 		 Rec_len = sc.nextFloat();
                 		 System.out.println("Enter the Breadth:");
                 		 Rec_br = sc.nextFloat();
						 obj.areaRectangle(Rec_len,Rec_br);
				         break;
				case 2 : System.out.println("Enter the Base:");
						 Tri_ba = sc.nextFloat();
						 System.out.println("Enter the Height:");
						 Tri_hei = sc.nextFloat();
						 obj.areaTriangle(Tri_ba,Tri_hei);
				         break;
				case 3 : System.out.println("Enter the Side:");
						 side = sc.nextFloat();
				 		 obj.areaSquare(side);
				         break;
				case 4 : System.out.println("Enter the Radius:");
				 		 r = sc.nextFloat();
				 		 obj.areaCircle(r);
				         break;
				case 5 : System.exit(0);
				         break;
				default : System.out.println("Invalid choice");
			}
			sc.close();

		// TODO Auto-generated method stub
	}
}