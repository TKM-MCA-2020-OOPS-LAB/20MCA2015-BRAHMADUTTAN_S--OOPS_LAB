import java.util.Scanner;

class Bubblesrt{
	void sort(int n,int arr[])
	{
		int i,j,temp;
		for(i=0;i<n;i++)
		  {
			for(j=0;j<n-1;j++)
			  {
				if(arr[j]>arr[j+1])
				  {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				  }
			  }
		  }
	}
	void display(int n,int arr[])
	{
		int i;
		for(i=0;i<n;i++)
		  {
			System.out.println(arr[i]+" ");
		  }
	}
	
}
public class Bubble_sort {
	
	public static void main(String[] args) {
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Elements to sort: ");
		n=sc.nextInt();
		int arr[] =new int[n];
		System.out.println("Enter "+n+" Elements");
		for(i=0;i<n;i++)
		  {
			arr[i]=sc.nextInt();
		  }
		sc.close();
		Bubblesrt bsrt= new Bubblesrt();
		
		System.out.println("Elements before sorting: ");
		bsrt.display(n, arr);
		
		bsrt.sort(n, arr);
		System.out.println("Elements after sorting: ");
		bsrt.display(n, arr);
		
		// TODO Auto-generated method stub

	}

}
