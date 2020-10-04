import java.util.Scanner;
public class CalculateSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter salary");
		Scanner scanner=new Scanner(System.in);		
		int salary=scanner.nextInt();
		if(salary>8000)
			System.out.println("salary too large");
		else if(salary<0)
			System.out.println("salary too small");
		else
		{
		System.out.println("Enter no of shift");
		int shift=scanner.nextInt();
		if(shift<=0)
			System.out.println("shift too small");
		else {
		int saving=salary-(salary*20/100)-(salary*30/100)+shift*(salary*2/100);
		System.out.println("saving of karen is "+saving);}
		}
	}

}
