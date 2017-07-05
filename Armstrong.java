
import java.util.Scanner;

public class Armstrong {
	 public static void main(String[] args)  {  
		 Scanner sc = new Scanner (System.in);
		    int c=0,a,temp,n;  
		    
		    System.out.println("Enter the 3 digit number");
		    n=sc.nextInt();
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
		}  

