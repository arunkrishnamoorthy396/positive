import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Large {
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter three values");
 int a=sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();
 if(a>b && a>c){
	 System.out.println(a+ " is large value");}
 else if(b>a && b>c)
	 System.out.println(b+ " is large value");
 else
	 System.out.println(c+ " is large value");
}
}
