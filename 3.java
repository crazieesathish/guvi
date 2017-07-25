import java.io.*;
public class Index
{
public static void main(String ar[])throws Exception
{
int p;
Scanner sc=new Scanner(System.in);
p=sc.nextInt();
int ar[]=new int[p];
for(i=0;i<p;i++)
ar[i]=sc.nextInt();
for(i=0;i<p;i++)
{
if(ar[i]==i)
System.out.println("the number"+ar[i]+"is equals to its index"+i);
}
}
}