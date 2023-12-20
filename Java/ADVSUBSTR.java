import java.util.*;
public class ADVSUBSTR{
    public static void permu(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currcharacter=str.charAt(i);
            System.out.println("Currentchar: "+currcharacter);
            //abc-->"ab"
            String newStr=str.substring(0,i)+str.substring(i+1);// ende index is not given it  means it will take the rest of string after the begin index
            System.out.println("newStr:  "+newStr);
            permu(newStr,permutation+currcharacter);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println("The permutations are : ");
       
        sc.close();
        permu(str,"");
    }
}