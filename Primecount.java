import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Primecount 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter the range : ");
        int range=Integer.parseInt(br.readLine());
        int range2=Integer.parseInt(br.readLine());
        System.out.println();
        for(int i=range;i<=range2;i++)
        {
            int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                }
            }
            if(flag==0)
                System.out.print(i+" ");
        }
        System.out.println();
 
    }
}
