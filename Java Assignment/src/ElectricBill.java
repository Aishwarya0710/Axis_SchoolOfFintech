import java.util.Scanner;
public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter current reading");
		int curr_reading=scanner.nextInt();
		System.out.println("Enter prev reading");
		int prev_reading=scanner.nextInt();
		int units_consumed=curr_reading-prev_reading;
		float total=0;
		if(units_consumed>30)
		{
			total=total+(float)(30*2.3);
			units_consumed=units_consumed-30;
		}	
		if(units_consumed>70)
		{
			total=total+(float)(70*3.5);
			units_consumed=units_consumed-70;
		}
		total=total+(float)(units_consumed*4.6);
		
		System.out.println("Bill amout");
		System.out.println(String.format("%.2f",total));
	}

}
