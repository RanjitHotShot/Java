import java.util.*;
public class OCUR{
    public static int first=-1;
    public static int last=-1;
    public static void occurance(String a,int index,char element){
        if(index==a.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentcharacter=a.charAt(index);
        if(currentcharacter==element){
            if(first==-1){
                first=index;
            }
            else
            {
                last=index;
            }
        }
        occurance(a,index+1,element);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String a=sc.next();
        occurance(a,0,'a');
        sc.close();
    }
}