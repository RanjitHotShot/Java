import java.util.*;
public class REVSTR{
    public static void rev(String a,int len){
        if(len==0){
            System.out.print(a.charAt(len));
            return ;
        }
        System.out.print(a.charAt(len));
        rev(a,len-1);        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.next();
        sc.close();
        rev(a,a.length()-1);
    }
}