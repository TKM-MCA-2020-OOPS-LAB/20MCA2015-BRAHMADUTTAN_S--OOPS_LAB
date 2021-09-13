package co6;

import java.io.*;

class co6qn1 {
	public static void main(String[] args)
	{
		//create a file object
		File directory = new File("E:\\MCA\\Semester 2\\Java Programming\\Programs\\co4\\src");
		
		
		String[] fileList = directory.list();
		int flag = 0;
		if(fileList == null)
		{
			System.out.println("Empty directory");
		}
		else
		{
			for(String str : fileList)
			{
				System.out.println(str);
			}
		}
		
		for(int i=0; i < fileList.length; i++)
		{
			String filename  = fileList[i];
			if(filename.equalsIgnoreCase("area.java"))
			{
				System.out.println("\n\n" +filename + " found");
                flag = 1;
			}
		}
		if(flag == 0) 
		{
            System.out.println("\n\nFile Not Found");
        }
	}
}
