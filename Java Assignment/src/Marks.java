import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the no of students");
		 Scanner scanner=new Scanner(System.in);		
		int n=scanner.nextInt();
		int [] marks=new int[n]; 
        System.out.println("Enter the marks");
        for(int i=0;i<n;i++)
        {
        	marks[i]=scanner.nextInt();
        }
        int min=marks[0],max=marks[0];
        int sum=marks[0];
        for(int i=1;i<n;i++)
        {
        	if(marks[i]>max)
        		max=marks[i];
        	if(marks[i]<min)
        		min=marks[i];
        	sum=sum+marks[i];
        }
        System.out.println("Maximum is"+max);
        System.out.println("Minimum is"+min);
        System.out.println("Average is"+(sum/n));
	}

}
