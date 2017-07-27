import java.util.Random;

    import java.util.Scanner;
 public class KthLargest 

    {

        static int B=50;

        static int []sequence = new int[B];

        public static void sort()

        {

            System.out.println("The Sequence is: ");

            for(int i=0; i<B; i++)

                System.out.print(sequence[i] + " ");

            System.out.println();

     

            int i, j, temp;

            for (i = 1; i< B; i++) 

            {

                j = i;

                temp = sequence[i];    

                while (j > 0 && temp < sequence[j-1])

                {

                    sequence[j] = sequence[j-1];

                    j = j-1;

                }

                sequence[j] = temp;            

            }        

        }

     

        public static void main(String args[])

        {

            
Scanner s=new Scanner(System.in);
System.out.println("enter the heights of students:");

    for(int i=0;i<B;i++)
        sequence[i]=s.nextInt();
sort();
System.out.println(4+"th tallest person is " + sequence[B-4]);
Scanner sc = new Scanner(System.in);

            System.out.println("Enter the kth tallest height to find");
               
            int k = sc.nextInt();

 System.out.println(k+"th tallest person is " + sequence[B-k]);

            sc.close();

        }

    }