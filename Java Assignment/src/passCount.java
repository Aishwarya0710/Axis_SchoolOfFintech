import java.util.Scanner;
public class passCount {
	public static int passed_student(int [] marks,int n)
    { 
        int count=0;
              for(int i=1;i<n;i+=2)
             {
                      if(marks[i]>=70)
                          count++;
}
return count;

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
        int [] marks=new int[n]; 
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
        	marks[i]=scanner.nextInt();
        	if(marks[i]<0)
        	{
        	System.out.println("invalid input");
        	System.exit(0);
        	}
        }          System.out.println(passed_student(marks,n));
        	}
	}

}
