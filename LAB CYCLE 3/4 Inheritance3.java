package co3qn4;
import java.util.Scanner;

class publisher {
	String p_name;
	int p_year;
	Scanner sc=new Scanner(System.in);
	
	publisher()
	{
		System.out.println("Enter Publisher name");
		p_name=sc.next();
		System.out.println("Enter the Year of Publication");
		p_year=sc.nextInt();
	}
}

class book extends publisher {
	String b_name,b_author;
	int b_price;
	Scanner sc=new Scanner(System.in);
	
	book() {
		System.out.println("Enter Book name");
		b_name=sc.next();
		System.out.println("Enter author");
		b_author=sc.next();
		System.out.println("Enter price");
		b_price=sc.nextInt();
	}
}

class literature extends book {
	int page;
	Scanner sc=new Scanner(System.in);
	
	literature() {
		System.out.println("Enter number of pages: ");
		page=sc.nextInt();
	}
	void display()
	{
		System.out.println("........LITERATURE BOOKS ARE........");
		System.out.println("Publisher name is "+p_name);
		System.out.println("Published year is "+p_year);
		System.out.println("Book name is "+b_name);
		System.out.println("Autho name is "+b_author);
		System.out.println("Price is "+b_price);
		
	}
}


class fictions extends book {
	int page;
	Scanner sc=new Scanner(System.in);
	
	fictions() {
		System.out.println("Enter number of pages");
		page=sc.nextInt();
	}
	void display()
	{
		System.out.println(".........FICTION BOOKS ARE.........");
		System.out.println("Publisher name is "+p_name);
		System.out.println("Published year is "+p_year);
		System.out.println("Book name is "+b_name);
		System.out.println("Autho name is "+b_author);
		System.out.println("Price is "+b_price);
		
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		int n,m,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of literatures books");
		n=sc.nextInt();
		literature l[]=new literature[n];
		for(int i=0;i<n;i++) {
			l[i]=new literature();
		}
		System.out.println("Enter number of fictions books");
		m=sc.nextInt();
		fictions f[]=new fictions[m];
		for(int i=0;i<m;i++) {
			f[i]=new fictions();
		}
		System.out.println("Enter your Choice \n1:LITERATURE\n2:FICTION");
		c=sc.nextInt();
		if(c==1) {
			for(int i=0;i<n;i++) {
				l[i].display();
			}
		}
		else if(c==2) {
			for(int i=0;i<n;i++) {
				f[i].display();
	    }
	 }
		else
			System.out.println("Wrong choice");
	  sc.close();
	// TODO Auto-generated method stub
  }
}