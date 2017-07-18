package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Hunter55 {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	int[] a = new int [7];
		System.out.println("Enter the array");
		for(int i=0;i<7;i++){
			a[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the number");
		int n = Integer.parseInt(br.readLine());
		
		for(int j=n;j<7;j++){
			System.out.print(a[j]);
		}
		for(int j=0;j<n;j++){
			System.out.print(a[j]);
		}
		
}
}
