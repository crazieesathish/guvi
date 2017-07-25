import java.util.*;
import java.io.*;

class CK_Sum_Zero
{
 public static void main(String[] args)
 {
   System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
   Scanner s=new Scanner(System.in);
   int p=s.nextInt();
   double[] Arr=new double[p];
   System.out.println("ENTER THE ELEMENTS:");
   for(int i=0;i<p;i++)
    {
     Arr[i]=s.nextDouble();
    }
   for(int i=0;i<p;i++)
   {
       for(int j=0;j<p;j++)
       {
         if(Arr[i]+Arr[j]==0 || ((Arr[i]+Arr[j]<1)&&(Arr[i]+Arr[j]>-1)))
          System.out.println("ELEMENTS ARE:"+Arr[i]+","+Arr[j]);
       }     
   }
 }
}    