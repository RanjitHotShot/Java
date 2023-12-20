import java.util.*;// java.util.HashSet;
public class UNIQHESUBSTR{
    public static void unique(String str,int index,String newStr,HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newStr)){//  checks if the string contains the string syntax learn
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);// add the new string to hash set learn syntax
                return;
            }
        }
        unique(str,index+1,newStr+str.charAt(index),set);
        unique(str,index+1,newStr,set);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();/// how to initialize a hash set of strings important
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println("The output is : ");
        unique(str,0,"",set);
        sc.close();
    }
}