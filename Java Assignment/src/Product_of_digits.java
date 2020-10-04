import java.util.Scanner;
public class Product_of_digits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of kms");
		Scanner scanner=new Scanner(System.in);		
		int kms=scanner.nextInt();
		if(kms<=0 || kms>32767)
		    System.out.println("invalid input");
		else
		{
			int product=1;
			while(kms!=0)
			{
				product*=kms%10;
				kms/=10;
			}
			System.out.println(product);
		}		
	}
}
