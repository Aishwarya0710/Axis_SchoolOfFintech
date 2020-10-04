import java.util.Scanner;

public class Sum_of_oddDigit {

    public static int Sum_of_oddDigits(int n)
{
    int result=0;
    while(n!=0)
    {
         int digit=n%10;
          if(digit%2!=0)
           result+=digit;
         n/=10;
}
return result;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);		
		int n=scanner.nextInt();
		if(n<=0)
		    System.out.println("invalid input");
              else if(n>32767)
                 	    System.out.println("num too large");

		else
		{    System.out.println(Sum_of_oddDigits(n));
		}       	}       	
	}


