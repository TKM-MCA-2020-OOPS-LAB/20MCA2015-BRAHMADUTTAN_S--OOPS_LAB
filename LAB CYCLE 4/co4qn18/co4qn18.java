package co4;

import java.util.*;

public class co4qn18 {

   public static void main(String args[]) {
	   
	   Map<String, String> map = new HashMap<>();
	   System.out.println("Enter the limit:");
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       System.out.println("Enter the Roll number and Name");
       while(n!=0) {
       	
       	String e= sc.next();
       	String s= sc.next();
       	map.put(e, s);
       	n--;
       }
	   
      System.out.println("HashMap:"+map);
      Map<String, String> treeMap = new TreeMap<>();
      treeMap.putAll(map);
      System.out.println("TreeMap:"+treeMap);
   }
}