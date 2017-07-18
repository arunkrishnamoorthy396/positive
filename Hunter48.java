package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Hunter48 {
public static void main(String[] args) throws IOException{
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the String");
    String s1 = br.readLine();
   System.out.println("Enter the substring");
   String sub = br.readLine();
  
System.out.println(s1.indexOf(sub));
	
	
}
}
