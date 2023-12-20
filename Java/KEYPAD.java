import java.util.*;
public class KEYPAD{
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqr","stu","vwxy","z"};
    public static void printCombinations(String str,int index,String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        char currentchar=str.charAt(index);
        String mapping=keypad[currentchar-'0'];
        for(int i=0;i<mapping.length();i++){
            printCombinations(str,index+1,combination+mapping.charAt(i));
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        printCombinations(str,0,"");
        sc.close();
    }
}