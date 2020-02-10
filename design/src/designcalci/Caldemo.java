package designcalci;
import java.util.Scanner;

public class Caldemo {

	public static void main(String[] args) {
		
int n1,n2;
Scanner in= new Scanner(System.in);
System.out.println("enter 1st number:");
n1= in.nextInt();
System.out.println("enter 2st number:");
n2=in.nextInt();
System.out.println("sum="+(n1+n2));
System.out.println("difference="+(n1-n2));
System.out.println("product="+(n1*n2));
System.out.println("quo="+(n1/n2));

	}

}
