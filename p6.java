class PalindromeExample{  
 public static void main(String args[]){  
  int g,sum=0,temp;    
  int n=454;  
  
  temp=n;    
  while(n>0){    
   g=n%10;   
   sum=(sum*10)+g;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  