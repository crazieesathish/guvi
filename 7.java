import java.util.*;

public class Unique 
{
public static void printDistinctElements(int[] arr)
{
for(int i=0;i<arr.length;i++)
{
boolean isDistinct = false;
for(int j=0;j<i;j++)
{
if(arr[i] == arr[j])
{
isDistinct = true;
break;
}
}
if(!isDistinct)
{
System.out.print(arr[i]+" ");
}
}
}
     
public static void main(String a[])
{
Unique u=new Unique();
int n;
System.out.println("Enter total no of values in the array");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=s.nextInt();
u.printDistinctElements(a);
}
}