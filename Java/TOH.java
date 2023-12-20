import java.util.*;
public class TOH{
    public static void towerOfHanoi(int n,String src,String help,String dest){
        if(n==1){
            System.out.println("Transfer disc"+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,help);
        System.out.println("Transfer disc "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1,help,src,dest);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=3;
        sc.close();
        towerOfHanoi(n,"S","H","D");
    }
}