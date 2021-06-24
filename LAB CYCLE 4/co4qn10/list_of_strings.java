import java.util.ArrayList;
import java.util.Collections;
public class list_of_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Ford Mustang");
		obj.add("Lamborghini");
		obj.add("Ferrari");
		obj.add("Jeep Wrangler");
		obj.add("Dodge Challenger");
		
		//Displaying array list after add operation
		System.out.println("\n Display Array List : \n");
		for(String list:obj)
			System.out.println("\t"+list);
		
		//Removing list elements from array
		obj.remove("Ferrari");
		System.out.println("\n Display List after Removing : \n");
		for(String list:obj)
			System.out.println("\t"+list);
		
		//Sorting Array list
		System.out.println("\n Sorted Array list : \n");
		Collections.sort(obj);
		for(String list:obj)
			System.out.println("\t"+list);
		
		//Get element at an index value 2
		System.out.println("\n Display Index element : "+obj.get(2));
		
		//Getting current size of list
		System.out.println("\n Size of the Array list: "+obj.size());
		
		//Clearing the Array list
		obj.clear();
		System.out.println("\n Clear all elements in Array list :"+obj);
	}

}
