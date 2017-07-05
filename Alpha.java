import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Alpha {
	
	
	    public static void main(String args[])
	    {
	        
	        Scanner sc = new Scanner(System.in);
			
	       
	         char ch = sc.next().charAt(0);
			
	        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
	        
	            System.out.print(ch + " is an Alphabet");
	        
	        else
	        
	           System.out.print(ch + " is not an Alphabet");
	        
	    }
	}

