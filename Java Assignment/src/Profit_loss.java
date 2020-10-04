import java.util.Scanner;
public class Profit_loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);	
		System.out.println("Enter the number of dozens of eggs purchaed");
		int X=scanner.nextInt();
		System.out.println("Enter the price per dozen");
		int Y=scanner.nextInt();
		System.out.println("Enter the selling price of one egg");
		int Z=scanner.nextInt();
		float CP=(float)Y/12;
		if(CP>Z)
		{
		float loss=(float)CP-Z;
		float loss_per=(float)(loss/CP*100);
		System.out.println(String.format("Hanish loss is %.2f", loss_per));
		}
		else if(CP<Z)
		{
		float gain=(float)Z-CP;
		float gain_per=(float)(gain/CP*100);
		System.out.println(String.format("Hanish gain is %.2f", gain_per));
		}
		else
			System.out.println("no profit no loss");
	}

}
