import java.util.Scanner;
public class Multitable {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n2=1;
	System.out.println("Enter the table number");
	int n=sc.nextInt();
	for(int i=1;i<=10;i++){
		//n2=1;
		int n1 = n2*n;
		System.out.println(n2+"*"+n+"="+n1);
		n2++;
		n1++;
	}
	
}
}
