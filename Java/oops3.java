/*POLYMORPHISM*/
import java.util.*;
class Car{
    String company;
    int cost;
    String colour;

    public Car(String company,int cost,String colour){
        this.company=company;
        this.cost=cost;
        this.colour=colour;        
    }

    public void INFO(String company){
        System.out.println("1The manufracturer is : "+company);
    }
    public void INFO(int cost,String colour){
        System.out.println("2The price of the car is : "+cost);
        System.out.println("2The colour of the car is :"+colour);
    }
    public void INFO(String company,String colour){
        System.out.println("3The manufracturer of the car is :"+company);    
        System.out.println("3The colour of the car is :"+colour);    

    }
}
public class oops3{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the company name :");
        String a=sc.nextLine().trim();
        System.out.println("Enter the price of the car :");
        int b=sc.nextInt();
        sc.nextLine();// removes new line
        System.out.println("Enter the colour of the car :");
        String c=sc.nextLine().trim();
        
        Car c1=new Car(a,b,c);

        c1.INFO(c1.company,c1.colour);
        sc.close();
    }
}