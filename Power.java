import java.util.Scanner;

public class Power {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int power = (int)Math.pow(a, b);
	System.out.println(power);
	
}
}
