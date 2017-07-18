package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter35 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s2 = "";
		String s3 = "";
		int n3;
	   System.out.println("Enter the String");
	   String s1 = br.readLine();
	   char[] c1 = s1.toCharArray();
	   int n = c1.length;
	   for(int i=0;i<n;i++){
		   for(int j=i+1;j<=n-1;j++){
			   if( c1[i] == c1[j]){
				   c1[i]=' ';
				   c1[j]=' ';
				   
			   }
				   
			   
			   
		   }
		    s2 = String.valueOf(c1[i]);
		    s3=s2.replaceAll(" ", "");
		//   System.out.print(s3);
		   
	   }
	    n3 = s3.length();
	   System.out.println("\n"+n3);
	   if(n3 == 0)
		  System.out.println("Double String");
	   
	  else
		 System.out.println("Not Double String");
	   
	   
	   
}
}
