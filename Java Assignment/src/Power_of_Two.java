
import java.util.Scanner;
public class Power_of_Two {
    public static boolean power_two(int n)
    {
    	if(n==0)
    		return false;
    	while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);	
		System.out.println("enter the no ");
		int n=scanner.nextInt();
		if(n<0)
		    System.out.println("number too small");
		else if(n>32767)
			System.out.println("number too large");
		else
		{
			if(power_two(n))
			   System.out.println("yes");
			else
				System.out.println("no");
		}
	}

}
