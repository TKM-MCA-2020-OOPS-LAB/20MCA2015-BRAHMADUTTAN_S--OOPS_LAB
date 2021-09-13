package co6;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class co6qn2 {
	public static void main(String[] args)
	{
		try 
		{
			FileWriter fw = new FileWriter("file1.txt");
			fw.write("Hi User welcome to Java Programming \n");
			fw.write("Here is your first program");
			fw.close();
			
			FileReader fr = new FileReader("file1.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println("file content: "); 
            String line;
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
			fr.close();	
		}
		catch (IOException e)
		{
			System.out.println("An error occurred!!!....");
		}
	}
}
