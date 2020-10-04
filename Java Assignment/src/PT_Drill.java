import java.util.Scanner;
public class PT_Drill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of students");
		Scanner scanner=new Scanner(System.in);		
		int n=scanner.nextInt();
		int row=(int )Math.sqrt(n);
		String [][] rows=new String[row][row]; 
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				rows[i][j]=scanner.next();
			}
		}
		int middle=row/2;
		System.out.print("middle row:");
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<row;j++)
			{
				if(i==middle)
				System.out.print(rows[i][j]+" ");
				
			}
			
		}
		System.out.println();
		System.out.print("middle column:");
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<row;j++)
			{
				if(j==middle)
				System.out.print(rows[i][j]+" ");
				
			}
			
		}
	}

}
