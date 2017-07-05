import java.util.Scanner;

public class Prime {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n,m,l,flag=0;
	 n = sc.nextInt();
	 if(n==0 || n==1)
		 System.out.println("given number is not a prime");
	 else{
	 for(int i=2;i<=n;i++){
		 if(n%2==0){
			 flag = 1;
			 System.out.println(n+"  is not a prime");
			 break;
		 }
	 }
	 if(flag==0)    
		  System.out.println(n+" is prime Number");  
	 
	
}}
}
