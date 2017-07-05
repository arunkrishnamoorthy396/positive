import java.util.Scanner;

public class Hello {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n=5;
	String s1="Hello" ;
	String s2="" ;
	for(int i=0;i<n;i++){
		s2=s2+s1;
	}
	System.out.println(s2);
}
}
