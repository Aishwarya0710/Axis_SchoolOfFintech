
import java.util.Scanner;
public class Arithmetic_operation {
    public static int calculator(int n1,int n2,int op)
    {
    	switch(op)
    	{
    	case 1:return (n1+n2);
    	case 2:return (n1-n2);
    	case 3:return (n1*n2);
    	case 4:return (n1/n2);
    	default:return -1;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number1 ,number2 and choice of operation");
		Scanner scanner=new Scanner(System.in);		
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		int op=scanner.nextInt();
		if(n1<0 || n2<0 || n1>32767 || n2>32767)
		    System.out.println("invalid input");
		else
			System.out.println(calculator(n1,n2,op));
	}

}
