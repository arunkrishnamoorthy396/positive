import java.util.Scanner;

public class Reverse {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int result =0;
		
System.out.println("Enter the number");
int n = sc.nextInt();
int rem=0;
while(n>0) {
	rem=n%10;
	n=n/10;
	result =result*10+rem;
}
System.out.println(result);
}
}
