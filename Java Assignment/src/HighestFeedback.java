import java.util.Scanner;
public class HighestFeedback {
	public static void Highest_feedback(int [] Metlife,int [] Hardfort,int n)
	{
           int k=0,l=0;
           int [] count=new int[n];
           int [] feedback=new int[2*n];
           for(int i=0;i<n;i+=2)
           {
               int flag=0;
               for(int j=0;j<n;j+=2)
               {
                   if(Metlife[i]==Hardfort[j])
                   {
                       flag++;
                       feedback[k]=Metlife[i];
                        k++;
                      if(Metlife[i+1]>Hardfort[j+1])
                          feedback[k]=Metlife[i+1];
                     else
                         feedback[k]=Hardfort[j+1];
                     k++;
                     count[l]=Metlife[i];
                      l++;
                        
                    } 
                    
                           
                }
                 if(flag==0)
                    {
                         feedback[k++]=Metlife[i];
                      feedback[k++]=Metlife[i+1];
                 } 
             }
             for(int i=0;i<n;i+=2)
             {
                  int flag=0;
                  for(int j=0;j<l;j++)
                 {
                                                 
                      if(Hardfort[i]==count[j])
                      {
                           flag++;
                           break;
                      }
                      
                 }
                 if(flag==0)
                 {
                      feedback[k++]=Hardfort[i];
                      feedback[k++]=Hardfort[i+1];
                  }

              }
              for(int i=0;i<k;i++)
                  System.out.println(feedback[i]);	     
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
	        int [] Metlife=new int[n]; 
	        int [] Hardfort=new int[n]; 

	        System.out.println("Enter the elements");
	        for(int i=0;i<n;i++)
	        {
	        	Metlife[i]=scanner.nextInt();
	        	if(Metlife[i]<0)
	        	{
	        	System.out.println("invalid input");
	        	System.exit(0);
	        	}
	        }   
	        for(int i=0;i<n;i++)
	        {
	        	Hardfort[i]=scanner.nextInt();
	        	if(Hardfort[i]<0)
	        	{
	        	System.out.println("invalid input");
	        	System.exit(0);
	        	}
	        }      
	       Highest_feedback(Metlife,Hardfort,n);
	        	}   	        

	}

}
