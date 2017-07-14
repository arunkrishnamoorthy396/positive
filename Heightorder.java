package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Heightorder {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	float f [] = new float[5];
	ArrayList<Float> list = new ArrayList<Float>();

	int n= f.length;
	System.out.println("Enter the heigths");
	for(int i=0;i<n;i++){
		f[i] = Float.parseFloat(br.readLine());
		list.add(f[i]);
	}
	//for(int a:list){
		//System.out.println
	
	Collections.sort(list);
		for(Float a:list){
				System.out.println(a);}
	System.out.println("Fourth tallest person's heigth : "+list.get((n-4)));
	
	System.out.println("Enter the number");
	int k = Integer.parseInt(br.readLine());
	System.out.println(list.get(k-1));
	
	
}
}
