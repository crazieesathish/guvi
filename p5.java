import java.util.*;
import java.io.*;

class CK_Maximum_Sum
{
 public static void main(String[] args)
 {
   int A=0,B=0;
   System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
   Scanner s=new Scanner(System.in);
   int p=s.nextInt();
   int[] Arr=new int[p];
   System.out.println("ENTER THE ELEMENTS:");
   for(int i=0;i<p;i++)
    {
     Arr[i]=s.nextInt();
    }
    int x=0,y=0,z=0;
   for(int i=0;i<p-2;i++)
   {
    
     for(int j=i+1;j==i+1 ;j++ )
      {
          for(int k=j+1;k==j+1;k++)
          {
              A=Arr[i]+Arr[j]+Arr[k];
              if(A>B)
              {
                  B=A;
                  x=Arr[i];
                  y=Arr[j];
                  z=Arr[k];      
              }

          }
      }
     } System.out.println("POSSIBLE GREATEST SUM IS: "+B+"\nELEMENTS ARE:: "+x+" "+y+" "+z);
   }
 }