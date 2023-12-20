import java.util.*;
public class ADVMAZE{
    public static int countpaths(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        //move downwards
        int dowmpaths=countpaths(i+1,j,n,m);
        //move upwards
        int upwardpaths=countpaths(i,j+1,n,m);
        int totalpaths=dowmpaths+upwardpaths;
        return totalpaths;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int n=sc.nextInt();
        int c=countpaths(0,0,n,m);
        sc.close();
        System.out.println(c);
    }
}