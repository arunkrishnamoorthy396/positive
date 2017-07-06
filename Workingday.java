import java.util.Scanner;

public class Workingday {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the day");
	String workingday=sc.nextLine();
	if((workingday.equalsIgnoreCase("saturday"))|| (workingday.equalsIgnoreCase("sunday")))
		System.out.println("false");
	else if((workingday.equalsIgnoreCase("monday"))|| (workingday.equalsIgnoreCase("tuesday")) || (workingday.equalsIgnoreCase("wednesday"))|| (workingday.equalsIgnoreCase("thursday")) || (workingday.equalsIgnoreCase("friday")))
		System.out.println("true");
	else
		System.out.println("Enter the valid day");
		
}
}
