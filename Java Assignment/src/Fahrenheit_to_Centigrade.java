import java.util.Scanner;

public class Fahrenheit_to_Centigrade {
    public static float convert(int fahrenheit)
    {
    	float result=(float)((fahrenheit-32)/9*5);
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the temperature");
		Scanner scanner=new Scanner(System.in);		
		int fahrenhiet=scanner.nextInt();
		if(fahrenhiet<=0)
		    System.out.println("invalid input");
		else
		{
		    float centigrade=convert(fahrenhiet);	
		    System.out.println(String.format("%.2f",centigrade));
		}
	}

}
