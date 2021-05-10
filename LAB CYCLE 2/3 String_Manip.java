package co2;

public class String_Manip {

	public static void main(String[] args) {
		String st1="WELCOME TO";
		System.out.println("string 1 is :"+ st1);
		String st2="Java Programming Language";
		System.out.println("string 2 is :"+ st2);
		String st=st1.concat(st2);
		System.out.println("string concatenation : " + st);
		System.out.println("length of string "+ st2 +" is " +st2.length());
		System.out.println("Character at position 5 of string 2 : " + st2.charAt(5));
		System.out.println("Index of character 'O'in string 2 : " + st2.indexOf('o'));
		System.out.println("Compare To 'WELCOME': " + st1.compareTo("Welecome"));
		System.out.println("Contains sequence 'ing' in string 2 : " + st2.contains("ing"));
		System.out.println("EndsWith character 'O' in string 1 : " + st1.endsWith("O"));
		System.out.println("LowerCase of string 1 : " + st1.toLowerCase());
		System.out.println("UpperCase of string 2 : " + st2.toUpperCase());
		System.out.println("Replace 'WELCOME TO': " + st.replace("WELCOME TO", "HOW IS"));
		// TODO Auto-generated method stub

	}

}