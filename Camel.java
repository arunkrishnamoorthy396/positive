
import java.util.Scanner;

public class Camel {
public static void main(String[] args){
	Scanner sc = new Scanner (System.in);
	String[] s2= new String[300];
	//char[] c2= new char [500];
	String s1=sc.nextLine();
	s2=s1.split(" ");
for(String s3 : s2){
	//System.out.println(s3);
	char[] c1=s3.toCharArray();
	c1[0] = Character.toUpperCase(c1[0]);
	String s = new String (c1);
	
	
	System.out.print(s+" ");
}

}
}
 
