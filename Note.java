package pp;
import java.util.Scanner;
public class Note
{
	public static void main(String []args)
{
		int c;
		System.out.println("enter the number to be checked");
		Scanner s=new Scanner(System.in);
		c= s.nextInt();
		
if(c%2==0)
	
{
	System.out.println("THE GIVEN NUMBER IS EVEN");
}
else
{
	System.out.println("The given number is odd");
}
}}
