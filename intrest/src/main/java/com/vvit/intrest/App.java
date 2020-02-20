package com.vvit.intrest;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
public class App {
	public static void main(String args[])
	{
	    Intrest intrest=new Intrest();
            double[] arr=new double[3];
            try
            {
	    File fileObj = new File("src/main/java/file.txt");
	    Scanner Reader = new Scanner(fileObj);
            int i=0;
            while (Reader.hasNextLine())
		{
			String s=Reader.nextLine();
                        double k=Double.parseDouble(s);
                        arr[i]=k;
                        i++;
            }
            Reader.close();
            }
            
            catch(Exception e)
            {
             System.out.println("No file");
            }
            try
            {
            FileWriter Writer = new FileWriter("src/main/java/outputfile.txt");		
	    Writer.write("Simple intrest is:"+intrest.SimpleIntrest(arr[0],arr[1],arr[2])); 
	    Writer.write("Compound intrest is:"+intrest.SimpleIntrest(arr[0],arr[1],arr[2]));
	    Writer.close();
            }
            catch(Exception e)
            {
             System.out.println("no file");
            }
	}

}