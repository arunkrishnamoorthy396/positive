package Hunter;

import java.util.Scanner;

public class Coprime134 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the two values");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int z = 0,z1 = 0;
	
	for(int i=2;i<a;i++){
		if(a%i == 0){
			z=1;
			break;
		}
		else 
			z=0;
	}
	
	for(int i=2;i<b;i++){
		if(b%i == 0){
			z1=1;
			break;
		}
		else 
			z1=0;
	}
	if(z==1 && z1==1)
		
	System.out.println("Not a Coprime");
	else
	
		System.out.println("Coprime");
	
}
}
