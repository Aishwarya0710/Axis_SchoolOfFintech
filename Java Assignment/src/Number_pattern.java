import java.util.Scanner;
public class Number_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);		
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%3!=0)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
	}

}
