    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    
   public class Fact
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		
    						Scanner sc = new Scanner(System.in);
    						int n,fact=1;
    						n=sc.nextInt();
    		for(int i=1;i<=n;i++){
    			fact=fact*i;
    		}
    		System.out.println(fact);
    	}
    }

