import java.util.*;
class Students
{
    String name;
    int age;
    String gender;
    //constructors
    public Students(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void printINFO(){
        System.out.println("The name of the student is : "+name);
        System.out.println("The age of the student is : "+age);
        System.out.println("The gender of the student is :"+gender);
    }
}
// main function
public class oops2{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name=sc.nextLine().trim();
        System.out.println("Enter the age of the student");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the gender of the student");
        String gender=sc.nextLine().trim();
        sc.close();
        
        Students s1=new Students(name,age,gender);
        s1.printINFO();
    }
}