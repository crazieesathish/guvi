import java.util.Scanner;
import java.io.*;
class Reverse_string
 {
  public static void main(String[] args)
  {
   String real,etin="";
   System.out.println("ENTER A STRING :");
   Scanner p=new Scanner(System.in);
   real=p.nextLine();
   String[] Arr=real.split(" ");
   for(int i=Arr.length-1;i>=0;i--)
     {
       etin=etin+" "+Arr[i];
     }
     System.out.println("REVERSED ORDER OF WORDS IN STRING IS:\n"+etin);
  }
 } 