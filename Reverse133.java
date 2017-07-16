package Hunter;

import java.util.Scanner;

public class Reverse133 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String[] s2 = new String [2] ; 
	System.out.println("Enter the String");
	String s1 = sc.nextLine();
	s2 = s1.split(" ");
	System.out.println(s2[1] +" "+ s2[0]);
	
}
}
