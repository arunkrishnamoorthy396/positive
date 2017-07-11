public class Countnum {
public static void main(String[] args){
	int sum =0,sum1=0,i,j;
	for(i=0;i<15;i++){
		sum=sum+i;
	}
	System.out.println("Sum of numbers from 1 to 15 :"+sum);
	
	for(j=15;j<45;j++){
		//for(int k=j;k<45;k++){
		if(j%2!=0)
			sum1=sum1+j;
		
		//System.out.println(sum1);
	}
	System.out.println("Odd numbers between 15 to 45  :"+sum1);
}
}
