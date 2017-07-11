
import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two values");
	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();
	    int gcd = 0;

	    for (int k = 2; k <= n1 && k <= n2; k++){
	        if(n1 % k == 0 && n2 % k == 0){
	            gcd = k;
	        }
	    }

	    System.out.println(gcd);
	}
}
