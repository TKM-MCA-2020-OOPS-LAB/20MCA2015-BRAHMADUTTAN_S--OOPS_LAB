import java.util.Scanner;
class UsernameException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsernameException(String U_name) {
	   super(U_name);
	}
	}
class PasswordException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PasswordException(String P_word) {
		super(P_word);
	}
}
public class Authenticate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String uname,pwd;
		int length;
		System.out.println("Enter Username: ");
		uname=sc.nextLine();
		length=uname.length();
		System.out.println("Enter Password: ");
		pwd=sc.nextLine();
		
		try {
			if(length<8)
				throw new UsernameException("Username must greater than 8 charecters");
			else if(!pwd.equals("Brahman@123"))
				throw new PasswordException("Incorrect Password\n Type Correct one");
			else
				System.out.println("Successfully Logged in.....");
			}
		
		catch(UsernameException u) {
			System.out.println("Exception Occurred. . "+u);
		}
		catch(PasswordException p) {
			System.out.println("Exception Occurred. . "+p);
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
