import java.util.Scanner;
public class Runrate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bowled_over,target;
		float current_rr,req_rr;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of overs bowled");
		bowled_over=scanner.nextInt();
		System.out.println("Enter current run rate");
		current_rr=scanner.nextFloat();
		System.out.println("Enter target");
		target=scanner.nextInt();
		req_rr=(target-(current_rr*bowled_over))/(50-bowled_over);
		System.out.println("The required run rate is ");
		System.out.println(String.format("%.2f",req_rr));
	}

}
