package co6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class co6qn4 
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fr = new FileInputStream("C:\\Users\\ACER\\OneDrive\\Desktop\\Java Programs\\Integers.txt");
		FileOutputStream fw1 = new FileOutputStream("C:\\Users\\ACER\\OneDrive\\Desktop\\Java Programs\\Odd num.txt");
		FileOutputStream fw2 = new FileOutputStream("C:\\Users\\ACER\\OneDrive\\Desktop\\Java Programs\\Even num.txt");
		
		System.out.println(" Successfully copied odd and even numbers in different files");
		
		int i;
		while((i=fr.read()) != -1)
		{
			if(i % 2 == 0)
			{
				fw2.write(i);
			}
			else
			{
				fw1.write(i);
			}
		}
		fr.close();
		fw1.close();
		fw2.close();
	}
}
