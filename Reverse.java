import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		String s1=sc.nextLine();
		char[] c1=s1.toCharArray();
		for(int i=c1.length-1;i>=0;i--){
			System.out.print(c1[i]);
		}
	}
}
