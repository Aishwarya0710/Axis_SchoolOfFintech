import java.util.Scanner;
public class Class_room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int [] C=new int[3]; 
        for(int i=0;i<3;i++)
        {
        	System.out.println("Enter the capacity of C"+(i+1));
        	C[i]=scanner.nextInt();
        }
        System.out.println("Enter the number of students");
		int n=scanner.nextInt();
		int count=0;
		for(int i=0;i<3;i++)
		{
			if(n<=C[i])
				count++;
		}
		 System.out.println(count+" labs can accomodate "+n+" students");
	}

}
