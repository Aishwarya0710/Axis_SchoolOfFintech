package com.ticketGeneration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TrainDAO {
     public String findTrain(int trainNo) throws IOException
     {
    	 String result="";
    	 
    	 BufferedReader bir=new BufferedReader(new FileReader("E:\\Java Assignments\\CaseStudy\\src\\com\\ticketGeneration\\train.txt"));
    	 while(bir.read()!=-1)
    	 {
    		 String detail=bir.readLine();
    		 if(Integer.toString(trainNo).equals(detail.substring(0, 4)))
    		 {
    			 result=detail;
    		 }
    	 }
    	 bir.close();
    	 return result;
     }
     
}
