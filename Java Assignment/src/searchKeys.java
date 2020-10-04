
import java.util.Scanner;
public class searchKeys {
    public static void search_key(int [] element,int n,int m)
    { 
        int count=0;
        int [] result=new int[n/2];
           for(int i=1;i<n;i+=2)
           {
                if(element[i]==m)
                 {
                     result[count]=element[i-1];
                      count++;  
                  }
              }
              for(int i=0;i<count;i++)
             {
                      System.out.println(result[i]);
}

    	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements");
		Scanner scanner=new Scanner(System.in);		
		int n=scanner.nextInt();
		if(n<=0)
		    System.out.println("invalid array size");
		else
		{
        int [] element=new int[n]; 
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
        	element[i]=scanner.nextInt();
        	if(element[i]<0)
        	{
        	System.out.println("invalid input");
        	System.exit(0);
        	}
        }
          System.out.println("Enter the value");
          int m=scanner.nextInt();
          if(m<0)
          { System.out.println("key not found");
            System.exit(0);
          }  
          search_key(element,n,m);
        	}
	}
}
