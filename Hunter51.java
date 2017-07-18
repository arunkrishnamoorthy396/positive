package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Hunter51 {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		
		System.out.println("Enter the two values");
		String n1 = br.readLine();
		String n2 = br.readLine();
		
		int a = Integer.parseInt(n1);
		int b = Integer.parseInt(n2);
		
	int sum = (a*b);
	//System.out.println(sum);
	
	String pro = String.valueOf(sum);
	System.out.println(pro);
}
}
