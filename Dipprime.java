import java.util.Scanner;
public class Dipprime{
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
    int n1,n2;
    System.out.println("enter the limits");
    n1=sc.nextInt();
    n2=sc.nextInt();
    for(int i=n1; i <=n2; i++){
            boolean isPrime = true;
            for(int j=2; j < i ; j++){

                    if(i % j == 0){
                            isPrime = false;
                            break;
                    }
            }
           
           if(isPrime)
                    System.out.print(i + " ");
    }
}

}
