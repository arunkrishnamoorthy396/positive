package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Reapeat {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int a[] = new int [6];
	int b[] = new int [6];
	int count=0;
	ArrayList<Integer> list = new ArrayList<Integer>();
	//int count =0;
	int n = a.length;
	System.out.println("Enter the reg numbers");
	for(int i=0;i<a.length;i++){
		a[i] = Integer.parseInt(br.readLine());
	}
	for(int i=0;i<n;i++){
		count =0;
		for(int j=i+1;j<n;j++){
			if(a[i] == a[j])
				//count ++;
				list.add( a[i]);
				
		}
		//if(count <2)
			//System.out.println(a[i]);
	}
	for(int a1:list){
	System.out.println(a1);}
	
}
}
