package co3qn5;
import java.util.Scanner;

class student {
	String Name;
	int Roll_No,English,Maths,Science,Social;
	Scanner sc=new Scanner(System.in); 
	public student() {
		System.out.println("Enter the name of the student");
		Name=sc.next();
		System.out.println("Enter Student Roll No: ");
		Roll_No=sc.nextInt();
		System.out.println("Enter the mark of English: ");
		English=sc.nextInt();
		System.out.println("Enter the mark of Maths: ");
		Maths=sc.nextInt();
		System.out.println("Enter the mark of Science: ");
		Science=sc.nextInt();
		System.out.println("Enter the mark of Social: ");
		Social=sc.nextInt();
	}
	
}
class sports extends student{
	String Football,Cricket;
	public sports() {
		System.out.println("Enter the grade in Football");
		Football=sc.next();
		System.out.println("Enter the grade in Cricket");
		Cricket=sc.next();
	}
}
class result extends sports{
	public result() {
		
	}
	int Total=English+Maths+Science+Social;
	void display(){
		System.out.println("------Score Card of Student "+Name+"------");
		System.out.println("Subjects ");
		System.out.println("English out of 100: "+English);
		System.out.println("Maths out of 100: "+Maths);
		System.out.println("Science out of 100: "+Science);
		System.out.println("Social out of 100: "+Social);
		System.out.println("Total Scored in Academics out of 400: "+Total);
		System.out.println("--Sports Grades-- ");
		System.out.println("Football Grade ---> "+Football);
		System.out.println("Cricket Grade --->"+Cricket);
	}
}
public class Final_score_card {
	
	public static void main(String[] args) {

		result obj = new result();
		obj.display();
		// TODO Auto-generated method stub

	}

}

