package com.vvit.House;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
public class App
{
	public static void main(String args[])
	{
		    House house=new House();
            String material="",automated="";
            int area=0;
            try
            {
	         File fileObj = new File("src/main/java/input.txt");
	         Scanner Reader = new Scanner(fileObj);
			 material=Reader.nextLine();
			 String s=Reader.nextLine();
			 area=Integer.parseInt(s);
			 automated=Reader.nextLine();
			 Reader.close();
            }
            catch(Exception e)
            {
             System.out.println("No file");
            }
            try
            {
              FileWriter Writer = new FileWriter("src/main/java/output.txt");		
	          Writer.write("Construction cost of the house is:"+house.constructionCost(material,area,automated)); 
	          Writer.close();
            }
            catch(Exception e)
            {
             System.out.println("no file");
            }
	}
}
	