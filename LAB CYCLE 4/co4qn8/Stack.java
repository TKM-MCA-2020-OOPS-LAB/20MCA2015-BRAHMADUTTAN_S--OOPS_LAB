import java.util.Scanner;

class Operations {
	public void operation() {
		int N,El,ch,top=-1;
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stack size: ");
		N=sc.nextInt();
		int[] arr=new int[N];
		
		do {
			System.out.println("\n__________________\n");
			System.out.println("  Operations : \n1.Push \n2.Pop \n3.Display \n4.Exit  ");
			System.out.println("\n__________________\n");
			ch=sc.nextInt();
			size=N-1;
			switch(ch) {
			
			case 1: if(top==size)
					{
						System.out.println("Warning!!!!!!!.......Stack is Full.....");
					}
					else
					{
						System.out.println("Enter your Element: ");
						El=sc.nextInt();
						top++;
						arr[top]=El;
					}
					break;
					
			case 2: if(top==-1)
					{
						System.out.println("Warning!!!!!!!.......Stack is Empty.....");
					}
					else
					{
						System.out.println("Element "+arr[top]+" removed");
						top--;
					}
					break;
					
			case 3: if(top==-1)
					{
						System.out.println("Warning!!!!!!!.......Stack is Empty.....");
					}
					else
					{
						System.out.println("Entered Stack: ");
						System.out.println("------");
						for(int i=top;i>=0;i--)
						{
							System.out.println("  "+arr[i]);
							System.out.println("------");
						}
					}
					break;
					
			case 4: System.exit(0);
			
			default: System.out.println("Invalid choice!!!");
			
			}
		}while(ch!=4);
		sc.close();
	}
	
}
public class Stack {

	public static void main(String[] args) {
		Operations op= new Operations();
		op.operation();
		// TODO Auto-generated method stub

	}

}