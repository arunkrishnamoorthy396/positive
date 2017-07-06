import java.util.Scanner;

public class Revowel {
public static void main(String []args){
	int j=0,k=0;
	Scanner sc = new Scanner(System.in);
	String s1=sc.nextLine();
	char[] c1=s1.toCharArray();
	char[] c2=new char[c1.length];
	char[] c3=new char[c1.length];
	for(int i=c1.length-1;i>=0;i--)
	{
		c2[j]=c1[i];
		j++;
	}
	System.out.print(c2);
	String s2=String.valueOf(c2);
	for(int i=0;i<=c1.length-1;i++){
	if(c2[i]== 'a'||c2[i]== 'e'|| c2[i]== 'i'|| c2[i]== 'o' || c2[i]=='u'||c2[i]=='A'||c2[i]== 'I'|| c2[i]== 'O'|| c2[i]== 'U' || c2[i]=='E'){
		continue;
		}else{
			c3[k]=c2[i];
	k++;
		}
	}
	String s3=String.valueOf(c3);
	System.out.println("\n"+s3);
	}
}
