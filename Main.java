import java.io.*;
import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
if(n<0){
System.out.println("number is negative");}
else if(n>0)
System.out.println("number is positive");
  else 
    System.out.println("number is zero");
}
}
