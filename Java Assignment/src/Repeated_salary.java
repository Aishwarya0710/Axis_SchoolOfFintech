import java.util.Scanner;
public class Repeated_salary {
    public static int add(int [] salary,int size)
    {
    	int count=1;
    	for(int i=0;i<size-1;i++)
    	{
    		int present_count=1;
    		for(int j=i+1;j<size;j++)
    		{
    			if(salary[i]==salary[j])
    				present_count++;
    		}
    		if(present_count>count)
    			count=present_count;
    	}
    	return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		System.out.println("Enter the number of employee");
		Scanner scanner=new Scanner(System.in);		
		int n=scanner.nextInt();
		if(n<=0)
		    System.out.println("invalid input");
		else
		{
			int [] salary=new int[n]; 
		    System.out.println("Enter the elements");
			for(int i=0;i<n;i++)
	        {
	        	salary[i]=scanner.nextInt();
	        	if(salary[i]<0)
	        	{
	        	System.out.println("invalid input");
	        	System.exit(0);
	        	}
	        }
			int count=add(salary,n);
    		System.out.println(count);
		}
	}

}
