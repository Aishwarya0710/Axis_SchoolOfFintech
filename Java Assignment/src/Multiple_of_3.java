
import java.util.Scanner;
public class Multiple_of_3 {
	 public static int find_count(int [] array,int n)
	 {
	    
	        int count=0;
	    	for(int i=0;i<n;i++)
	    	{
	    	    if(array[i]%3==0)
	    	    	count++;
	    	}
	    	return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);	
		System.out.println("enter the no of elements");
		int n=scanner.nextInt();
		if(n<=0)
		    System.out.println("invalid input");
		else
		{
			int [] array=new int [n];
			System.out.println("enter the array elements");
			for(int i=0;i<array.length;i++)
	        {
	        	array[i]=scanner.nextInt();
	        	if(array[i]<0)
	        	{
	        	System.out.println("invalid input");
	        	System.exit(0);
	        	}
	        }
			
			int count=find_count(array,n);
			System.out.println(count);
		}
	}

}
