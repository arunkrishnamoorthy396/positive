import java.util.Scanner;

public class Palindrome {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int temp,s=0,a;
	a=sc.nextInt();
	temp=a;
	while(a>0){
		int r = a%10;
		s=(s*10)+r;
		a=a/10;
	}
	
	if(temp==s)
		System.out.println(s+" is palindrome");
	else
		System.out.println(s+" is not palindrome");
}
}
