import java.util.Scanner;
public class Special_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);		
		int n=scanner.nextInt();
		int first=2,second=1,third=3;
		int i=0;
		System.out.print(first+" "+second+" "+third+" ");
		while(i<n)
		{
			i=first+second+third;
			if(i>n)
			{
				break;
			}
			System.out.print(i+" ");
			first=second;
			second=third;
			third=i;
		}
		
	}

}
