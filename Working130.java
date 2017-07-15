package Hunter;

import java.util.Scanner;

public class Working130 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the day");
	String s1 = sc.nextLine();
	if ( (s1.equalsIgnoreCase("sat")) || (s1.equalsIgnoreCase("sun"))  )
	System.out.println(s1+" is holiday");
	else
		System.out.println(s1+" is Workingday");
		
}
}
