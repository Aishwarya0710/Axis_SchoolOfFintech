import java.util.Scanner;
public class Vehicle_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);	
		System.out.println("Enter 1st number");
		int m=scanner.nextInt();
		System.out.println("Enter 2nd number");
		int n=scanner.nextInt();
		for(int i=m;i<=n;i++)
		{
			
			int a=i;
			int sum = 0; 
		    while (a != 0) 
		    { 
		     sum = sum + a % 10; 
		     a = a/10; 
		    }  
			
            if(sum==9)
            {
            	
            	System.out.println(i);
            }

		}
	}

}
