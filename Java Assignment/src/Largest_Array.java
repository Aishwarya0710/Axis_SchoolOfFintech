import java.util.Scanner;
public class Largest_Array {
	public static void Largest_array(int [] first,int [] second,int n)
	{
	     int [] output=new int [n];
	      for(int i=0;i<n;i++)
	       {
	             if(first[i]>second[i])
	                output[i]=first[i];
	             else
	                output[i]=second[i]; 
	}   
	      for(int i=0;i<n;i++)
	        {
	        	
	        	System.out.println(output[i]);
	    
	        } 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the number of elements");
			Scanner scanner=new Scanner(System.in);		
			int n=scanner.nextInt();
			if(n<=0)
			    System.out.println("invalid array size");
			else
			{
	        int [] first=new int[n]; 
	        int [] second=new int[n]; 

	        System.out.println("Enter the elements");
	        for(int i=0;i<n;i++)
	        {
	        	first[i]=scanner.nextInt();
	        	if(first[i]<0)
	        	{
	        	System.out.println("invalid input");
	        	System.exit(0);
	        	}
	        }   
	        for(int i=0;i<n;i++)
	        {
	        	second[i]=scanner.nextInt();
	        	if(second[i]<0)
	        	{
	        	System.out.println("invalid input");
	        	System.exit(0);
	        	}
	        }      
	       Largest_array(first,second,n);
	        	}   	        

	}

}
