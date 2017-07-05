import java.io.*;
import java.util.*;
public class Vowel{
public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u' )
		System.out.println("given char is Vowel");
		else 
		System.out.println("given char is constant");

}
}
