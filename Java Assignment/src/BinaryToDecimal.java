import java.util.Scanner;

public class BinaryToDecimal{
      public static int convert_to_decimal(int binary)
       {
            if(binary<0 || binary>11111)
                return -1;
            int temp=0,n=0,result=0;
           while(true)
          {
              if(binary==0)
                  break;
              else
             {
                   temp=binary%10;
                   result+=temp*Math.pow(2,n);
                   binary/=10;
                   n++;
           }
}
return result;
        
              
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number ");
		Scanner scanner=new Scanner(System.in);		
		int n=scanner.nextInt();

			System.out.println(convert_to_decimal(n));

	}

}
