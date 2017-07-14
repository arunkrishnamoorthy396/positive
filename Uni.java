package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uni {
public static void main(String[]args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int a[] = new int [10];
	int count=0,i,j,ans=0;
	System.out.println("Enter the Array");
	for(i=0;i<10;i++){
		a[i]= Integer.parseInt(br.readLine());
	}
	for( i=0;i<10;i++){
		count = 0;
		for(j=0;j<10;j++){
			if(a[i]==a[j])
				count++;
		}
		if(count == 1)
			ans=a[i];
	}
	System.out.println(ans);
}
}
