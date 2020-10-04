
import java.util.Scanner;
public class Odd_even_average {
    public static float find_password(int [] element,int n)
    {
    	int even_sum=0,odd_sum=0;
    	for(int i=0;i<n;i++)
    	{
    		if(element[i]%2==0)
    			even_sum+=element[i];
    		else
    			odd_sum+=element[i];
    	}
    	float pass=(float)(even_sum+odd_sum)/2;
    	return pass;
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
        int [] element=new int[n]; 
        System.out.println("Enter the elements");
        int even_sum=0,odd_sum=0;
        for(int i=0;i<n;i++)
        {
        	element[i]=scanner.nextInt();
        	if(element[i]<0)
        	{
        	System.out.println("invalid input");
        	System.exit(0);
        	}
        }
        float pass=find_password(element,n);
        System.out.println(String.format("%.2f", pass));
	}
	}
}
