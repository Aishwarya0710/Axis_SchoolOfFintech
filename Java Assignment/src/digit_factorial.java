
import java.util.Scanner;

public class digit_factorial {
      public static int fact(int n)
       {
              if (n == 0)    
                return 1;    
            else    
               return(n * fact(n-1));   
}
	public static void cal_fact(int n)
    {
         int digits=0;
         int m=n;
         while(n!=0)
         {
               digits++;
              n/=10;
         }
         int []result= new int[digits];
          for(int i=result.length-1;i>=0;i--)
          { 
               int k=m%10;
               result[i]=fact(k);
                m=m/10;
          }
          for(int i=0;i<digits;i++)
               System.out.println(result[i]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number ");
		Scanner scanner=new Scanner(System.in);		
		int n=scanner.nextInt();
		if(n<0)
		    System.out.println("number too small");
		else if(n>32767)
			System.out.println("number too large");
		else
			cal_fact(n);

	}

}
