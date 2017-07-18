package Hunter;





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
public class Hunter50 {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int count = 0;
        int dividend = Integer.parseInt(br.readLine());
       int divisor=Integer.parseInt(br.readLine());
       if(divisor==0)
    	   System.out.println("Enter the valid no");
    	   else {
    		   while(dividend >= divisor){
    			   count = count+1;
    			   dividend=dividend-divisor;
    		   }
    	   }
       System.out.println(count);
    }
}
       
   
