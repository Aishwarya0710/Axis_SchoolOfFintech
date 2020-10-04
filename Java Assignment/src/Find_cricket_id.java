import java.util.Scanner;

public class Find_cricket_id {
	public static void find_ID(int [] cricketer,int size,int score)
    {
    	for(int i=1;i<size;i+=2)
    	{
    		if(cricketer[i]>score)
    			System.out.println(cricketer[i-1]);
    	}
    	
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
			int [] cricketer=new int[n]; 
		    System.out.println("Enter the elements");
			for(int i=0;i<n;i++)
	        {
	        	cricketer[i]=scanner.nextInt();
	        	if(cricketer[i]<0)
	        	{
	        	System.out.println("invalid input");
	        	System.exit(0);
	        	}
	        }
			System.out.println("enter score");
			int score=scanner.nextInt();
			if(score<0)
				System.out.println("invalid score");
			else
			    find_ID(cricketer,n,score);
    		
		}
	}

}
