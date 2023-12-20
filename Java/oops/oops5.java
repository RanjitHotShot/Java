package oops;
import java.util.*;
abstract class Animal{//thought not real exists not used 
    abstract void walk();  
    Animal(){
        System.out.println("Creating a Animal");
    }
    public void eats(){
        System.out.println("Eats");
    }  
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a horse");
    }
    public void walk(){
        System.out.println("Walks on four legs");
   }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Created a chicken");
    }
    public void walk(){
        System.out.println("Walks on two legs");
    }
}
public class oops5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Horse h1=new Horse();
        h1.walk();
        h1.eats();
        Chicken c1=new Chicken();
        c1.walk();
        c1.eats();
        // Animal a1=new Animal();//run time error .
        // a1.walk();
        sc.close();
    }
}