package Hunter;

import java.util.Scanner;

public class Removerepat123 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int count=0,i,j;
	System.out.println("Enter the input");
	String s1 = sc.nextLine();
	char[] c1 = s1.toCharArray();
	for(i=0;i<c1.length;i++){
		count =0;
		for(j=0;j<c1.length;j++){
		if(c1[i] == c1[j])
			count++;
	}
	if(count == 1)
		System.out.print(c1[i]); }
}
}
