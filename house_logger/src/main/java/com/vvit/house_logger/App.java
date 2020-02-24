package com.vvit.house_logger;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class App
{
	public static void main(String args[])
	{

           Logger logger=Logger.getLogger(App.class.getName());
           logger.log(Level.INFO,"lets estimate the house construction cost");
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
	