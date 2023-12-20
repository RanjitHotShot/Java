import java.util.*;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt();
        int c=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                c++;
                break;
            }
        }
        if(c>0)
        {
            System.out.println("The number is not prime.");
        }
        else{
            System.out.println("The entered number is prime.");
        }
        sc.close();
    }
}