/*To print the first 10 number using recursion */
import java.util.*;
public class recursion1
{
    public static void Print(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        Print(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        Print(n);
        sc.close();
    }
}