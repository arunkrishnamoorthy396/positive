package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter40 {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int r,sum=0,no=0;
	System.out.println("Enter the value n");
	//String n1 = br.readLine();
	int n = Integer.parseInt(br.readLine());
  while (n>0){
	   r = n%10;
	 no=(no+r);    
	  n=n/10;
	  
  }
  System.out.println(no);
  int temp=no;
  while( temp > 0){
	  r=temp%10;
     sum = (sum*10)+r;
     temp=temp/10;
  }
  
  System.out.println(sum);
  if(no == sum){
	  System.out.println("Palindrome");
  }
  else
	  System.out.println("Not a Palindrome");
	
}
}
