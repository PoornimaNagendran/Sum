package Guvi;
import java.util.Scanner;
public class SumOfNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter an input");
int a=s.nextInt();
int sum=0;
while(a!=0)
{
	sum=sum+a;
	a--;
}
System.out.println("Sum is "+sum);
	}

}
