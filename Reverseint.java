import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Reverseint
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
				Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		 int result = 0;
   int rem;
   while (n > 0) {
       rem = n % 10;
       n = n / 10;
       result = result * 10 + rem;
   }System.out.println(result);
	}
}
