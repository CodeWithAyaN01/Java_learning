import java.util.Arrays;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N Value");
        int n = sc.nextInt(); // array length 
        System.out.println("Enter k value");
        int k = sc.nextInt(); // sum that user asks ;
        System.out.println("Enter Array elements ");
        int[] list = new int[n];
        for (int i = 0 ; i<n ; i++)
        {
            list[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(list));
        int count = 0;
        for (int i = 0 ; i<list.length ; i++)
        {
            for (int j = i+1 ; j<list.length ; j++) // issue !! (j = 0)
            {   
                if(list[i] + list[j] == k)
                {
                    System.out.println("subset is {"+list[i]+" " + list[j] + "}");count++;
                    System.out.println("true");
                    // System.exit(0);
                }
            }
        }
        System.out.println("The total number of pair is " + count);
    }
}
