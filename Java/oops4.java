/*INHERITANCE */
import java.util.*;
class Shape{// base class parent class
    String colour;
}
class Triangle extends Shape{

}
public class oops4{// subclass child class
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Triangle t1=new Triangle();
        t1.colour="Red";
        sc.close();
    }
}