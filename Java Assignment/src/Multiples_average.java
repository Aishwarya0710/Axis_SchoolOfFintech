import java.util.Scanner;

public class Multiples_average {
	 public static float find_averageby5(int n)
	    { 
	        int count=0,sum=0;
	        float average;
	        int m=5;
	        while(n>=m)
	       {
	             if(m<=n)
	             {    sum+=m;
	                 m+=5;
	                count++;
	              }   
	         }
	        average=(float)sum/count;
	return average;

	    	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter the number of elements");
			Scanner scanner=new Scanner(System.in);		
			int n=scanner.nextInt();
			if(n<=0)
			    System.out.println("invalid input");
	              else if(n>32767)
	                 	    System.out.println("num too large");

			else
			{    float result=find_averageby5(n);
            
           System.out.println(String.format("%.2f",result));

			}       	}       	
		}


