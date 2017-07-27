import java.util.*;
public class RandomCards {

	
	public int[] swap(int q,int ran,int a[])
	{
		int temp;
		temp=a[q];
		a[q]=a[ran];
		a[ran]=temp;
		return a;
	}
	
	public int[] randomize(int a[])
	{
		
		int ran;
		if(a.length>1)
		{
			int q=a.length-1;
			while(q>0)
			{
				ran=(int)Math.random()*a.length;
				a=swap(q,ran,a);
				q--;
			}
			
		}
		
		return a;
	}
	public void print(int a[])
	{
		for(int q=0;q<a.length;q++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
			int a[]=new int[sc.nextInt()];
			RandomCards obj=new RandomCards();
			
			for(int q=0;q<a.length;q++)
			{
				a[q]=sc.nextInt();
			}
			a=obj.randomize(a);
			
			obj.print(a);
			
		
		
		}

}