package co4;
import java.util.HashSet;

public class co4qn16 
{
	public static void main(String[] args) 
	{
        // Create a empty hash set
        HashSet<String> set1 = new HashSet<String>();
        
        // use add() method to add values in the hash set
        set1.add("Benz");
        set1.add("BMW");
        set1.add("Lamborghini");
        set1.add("Ferarri");

        HashSet<String> set2 = new HashSet<String>();
        set2.add("Benz");
        set2.add("BMW");
        set2.add("Lamborghini");
        set2.add("Ferarri");
        
        //comparison output in hash set
        System.out.println("Comparing");
        HashSet<String>result_set = new HashSet<String>();
        for (String element : set1){
            System.out.println( set2.contains(element) ? "Yes" : "No");
        }
    }
}