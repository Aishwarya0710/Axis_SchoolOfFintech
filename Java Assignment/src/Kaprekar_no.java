import java.util.Scanner;
public class Kaprekar_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the number");
		 Scanner scanner=new Scanner(System.in);		
		int k=scanner.nextInt();
		int j=k;
		long num=k*k;
		int no_of_digits=0;
		while(j!=0)
		{
			j=j/10;
			no_of_digits++;
		}
		int result=0;
		int decimal=1;
		for(int i=0;i<no_of_digits;i++)
		{
			int rem=(int)num%10;
			result=rem*decimal+result;
			decimal=decimal*10;
			num=num/10;
		}
		int result1=0;
		decimal=1;
		while(num!=0)
		{
			int rem=(int)num%10;
			result1=rem*decimal+result1;
			decimal=decimal*10;
			num=num/10;
		}
		if(k==result+result1)
		    System.out.println("kaprekar number");
		else
			System.out.println("not a kaprekar number");
	}

}
