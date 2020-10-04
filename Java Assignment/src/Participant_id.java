import java.util.Scanner;
public class Participant_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of student");
		Scanner scanner=new Scanner(System.in);		
		int n=scanner.nextInt();
        int [] ID=new int[n]; 
        System.out.println("Enter the ID");
        for(int i=0;i<n;i++)
        {
        	ID[i]=scanner.nextInt();
        }
        
        System.out.println("enter id to search");
        int search=scanner.nextInt();
        while(search!=0)
        {
        	int flag=0;
        	for(int i=0;i<n;i++)
            {
            	if(search==ID[i])
            	{
            		flag=1;
            		System.out.println("exist");
            		break;            		
            	}
            }
        	if(flag==0)
        	{
        	System.out.println("not exist");
        	}
        	System.out.println("enter id to search");
        	search=scanner.nextInt();
        }
	}

}
