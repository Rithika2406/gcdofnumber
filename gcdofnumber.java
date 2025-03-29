import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner S=new Scanner(System.in);
	    int a=S.nextInt();
	    int b=S.nextInt();
	    int temp;
	    while(b!=0)
	    {
	        temp=b;
	        b=a%b;
	        a=temp;
	    }
		System.out.println("GCD of a number is:"+a);
	}
}