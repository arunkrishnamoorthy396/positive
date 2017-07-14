package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reversestring {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String");
	String s1 = br.readLine();
	StringBuffer sb = new StringBuffer(s1);
	
	sb.reverse();
	System.out.println(sb);
	
	
	
	
}
}
