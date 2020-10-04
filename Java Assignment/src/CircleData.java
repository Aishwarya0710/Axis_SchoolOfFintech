import java.util.Scanner;
public class CircleData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter radius");
		Scanner scanner=new Scanner(System.in);		
		float radius=scanner.nextFloat();
		System.out.println("Enter required output");
		String req= scanner.next();                  
		switch (req) {
		case "DIA":
			float dia=(float) 2*radius;
			System.out.println(String.format("Diameter of circle is %.2f",dia));
			break;
		case "AR":
			float area=(float) ((float) 2*radius*radius);
			System.out.println(String.format("area of circle is %.2f",area));
			break;
		case "PER":
			float per=(float) ((float) 2*3.14*radius);
			System.out.println(String.format("Permiter of circle is  %.2f",per));
			break;
		case "ARSEM":
			float sem=(float) 3.14*radius;
			System.out.println(String.format("area  of semi circle is  %.2f ",sem));
			break;
		default:
			break;
		}
	}
}
