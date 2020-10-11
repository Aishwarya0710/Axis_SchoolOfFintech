package com.ticketGeneration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Ticket {
    private int counter;
    private String pnr;
    private String Date;
    private String travelDate;
    private Train train;
    private TreeMap<Passenger,Integer> passengers;
    Map<Passenger,Integer> pass=new TreeMap<>();
    
    public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public Ticket( Train train,String travelDate) {
		super();
		
		this.train = train;
		this.travelDate = travelDate;
	}
	public Ticket() {
		super();
	}
	private String generatePNR()
    {
    	String PNR="";
    	Random random = new Random();
    	setCounter(random.nextInt(900) + 100);
    	PNR=PNR+getTrain().getSource().charAt(0)+getTrain().getDestination().charAt(0)+"_"+getDate().substring(6, 10)+getDate().substring(3,5)+getDate().substring(0,2)+"_"+getCounter();
    	return PNR;
    }
    private int calcPassengerFare(Passenger P)
    {
    	
    	int fair=(int) getTrain().getTicketPrice();
    	
    	if(P.getAge()<=12)
    	{
    		fair=(int) (fair*(0.05));
    	}
    	else if(P.getAge()>=60)
    	{
    		fair=(int)(fair*(0.60));
    	}
    	
    	else if(P.getGender()=='F')
    	{
    		fair=(int)(fair*(0.75));
    	}
    	
    	return fair;
    }
    public void addPassenger(String name,int age,char gender)
    {
    	
    	
    	
    	int fair=calcPassengerFare(new Passenger(name,age,gender));
    	
    	
    	
    	pass.put(new Passenger(name,age,gender), fair);
       	
    	
    }
   private  double calculateTotalTicketPrice()
    {
    	double totalFare=0.0;
    	for (Map.Entry<Passenger, Integer> entry : pass.entrySet()) 
    	{
    		totalFare+=entry.getValue();
    	}
    	return totalFare;
    }
   private StringBuilder generateTicket()
   {
	   StringBuilder ticket=new StringBuilder(" ");
	   ticket.append("PNR : "+generatePNR()+"\n");
	   ticket.append("Train No :"+getTrain().getTrainNo()+"\n");
	   ticket.append("Train Name :"+getTrain().getTrainName()+"\n");
	   ticket.append("From :"+getTrain().getSource()+"\n");
	   ticket.append("Destination :"+getTrain().getDestination()+"\n");
	   
	   ticket.append("travel Date:"+getDate()+"\n");
	   ticket.append("Passengers :\n");
	   ticket.append("Name"+"\t \t \t"+"Age"+"\t \t \t"+"Gender"+"\t \t \t"+"Fare\n");
	   for (Map.Entry<Passenger, Integer> entry : pass.entrySet()) 
   	{         ticket.append(entry.getKey().getName()+"\t\t\t"+entry.getKey().getAge()+"\t\t\t"+ entry.getKey().getGender()+ "\t\t\t " + entry.getValue()+"\n");
   	}
   	
	   ticket.append("Total Fare :"+calculateTotalTicketPrice()+"\n");
	  return ticket;
	   
   }
   public void writeTicket() throws IOException
   {
	   String filename=generatePNR()+".txt";
	   BufferedWriter bw=new BufferedWriter(new FileWriter(filename));
	   String data=generateTicket().toString();
	   bw.write(data);
	   System.out.println("Ticket Successfully booked with PNR"+filename);
	   bw.close();
   }
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public TreeMap<Passenger, Integer> getPassengers() {
		return passengers;
	}
	public void setPassengers(TreeMap<Passenger, Integer> passengers) {
		this.passengers = passengers;
	}
	
	
	
    
}
