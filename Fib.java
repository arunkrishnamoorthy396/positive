import java.util.*;
import java.lang.*;
import java.io.*;
 

 public class Fib
{
public static void main(String[] args ){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the limit");
	int n = sc.nextInt();
	int sum=0;
	int n1=0,n2=1,n3;
	for(int i=0;i<n;i++){
		 n3 = n1+n2;
		 System.out.println(n3);
		 n1=n2;
		 n2=n3;
 
	}
}
}
