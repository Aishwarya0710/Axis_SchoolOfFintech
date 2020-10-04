

import java.util.Scanner;
public class PrimeIndex {
    public static int checkprime(int num)
    {
        int i; 
	int flag=0; 
		for(i=2; i<num/2; i++)
	{
		if(num%i ==0)
		{
			flag =1;
			break;
		}
	}
	
	if(flag==1)
		return 0;
	else
		return 1;
}
    public static int find_average(int [] array,int n)
    {
       
    	int count=0,i,j;
    	int sum=array[2];

    	for(i=3;i<array.length;i++)
    	{
          
           int c=checkprime(i);
    	     if(c==1)	
            {
                
                sum=sum+array[i];
                count++;
        }
    	}
       
       int average=sum/count;
    	return average;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements in array");
		Scanner scanner=new Scanner(System.in);		
		int n=scanner.nextInt();
		if(n<=0)
		    System.out.println("invalid input");
		else
		{
			int size=n+1;
			int [] array=new int [size];
			array[0]=0;
			for(int i=1;i<array.length;i++)
	        {
	        	array[i]=scanner.nextInt();
	        	if(array[i]<0)
	        	{
	        	System.out.println("invalid input");
	        	System.exit(0);
	        	}
	        }
			int average=find_average(array,size);
			System.out.println(average);
		}
	}

}
