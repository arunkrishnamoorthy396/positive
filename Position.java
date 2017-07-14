import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Position {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int a[] = new int[6];
	System.out.println("Enter the array");
	for(int i=0;i<6;i++){
		a[i] = Integer.parseInt(br.readLine());
	}
	for(int i=0;i<6;i++){
		//for(int j=0;j<6;j++)
		if(a[i] == i ){
			System.out.println("The number "+a[i]+" equlas it's index "+i);
			break;
		}
	}
}
}
