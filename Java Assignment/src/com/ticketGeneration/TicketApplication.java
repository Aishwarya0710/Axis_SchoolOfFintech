package com.ticketGeneration;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class Passenger implements Comparable<Passenger>{
	private String name;
	private int age;
	private char gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Passenger(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public int compareTo(Passenger o) {
		// TODO Auto-generated method stub
		
		return this.getAge()-o.getAge();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		if (age != other.age)
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
				return true;
	}
	
	
	
	
}
public class TicketApplication {
    
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Train Number");
		int trainNo=sc.nextInt();
		TrainDAO T1=new TrainDAO();
		try {
			String str=T1.findTrain(trainNo);
			if(str.length()!=0)
			{
				 
		        String[] trainDetails = str.split("-", 5); 
		        Train train=new Train(Integer.parseInt(trainDetails[0]),trainDetails[1],trainDetails[2],trainDetails[3],Double.parseDouble(trainDetails[4]));
				
		        System.out.println("Enter travel date");
				String date=sc.next();
			   Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);  
			   Date currentDate = new Date(); 
			   if(date1.after(currentDate)) 
			   {
			    
			    System.out.println("Enter no of passengers");
			    Integer n=sc.nextInt();
			    Ticket T=new Ticket();
			    T.setTrain(train);
			    T.setDate(date);
			    //Ticket ticket=new Ticket(train, date);
			    for(int i=0;i<n;i++)
			    {   
			    	System.out.println("Enter name of passenger");
			    	String name=sc.next();
			    	System.out.println("Enter age of passenger");
		    	Integer age = sc.nextInt();
		    	System.out.println("Enter gender of passenger");
		    	char ch=sc.next().charAt(0);
		    	
		    	T.addPassenger(name, age, ch);}
		         T.writeTicket();
			   }
			   else
			   {
				   System.out.println("Date should be after current date");
				   System.exit(0);
			   }

			}
			else
			{
				System.out.println("Train not found");
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    	
	  
	}

}
