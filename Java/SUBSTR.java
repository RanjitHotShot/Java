import java.util.Scanner;
public class SUBSTR{
    public static void sequence(String str,int index ,String newStr){
        if(index==str.length()){// not str.length()-1
            System.out.println(newStr);
            return;
        }
        //to be or not to be
        sequence(str,index+1,newStr+str.charAt(index));
        sequence(str,index+1,newStr);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        sequence(str,0,"");
        sc.close();
    }
}
