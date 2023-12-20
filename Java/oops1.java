class PEN{
    String colour;
    String type;
    public void write(){// method1
        System.out.println("RENAULT PENS");
    }
    public void printcolour(){// method2
        System.out.println("The colour of the pen is : "+this.colour);
    }
    public void printtype(){
        System.out.println("The type of the pen is : "+this.type);
    }
}
// main function
public class oops1{
    public static void main(String[] args)
    {
        PEN p1=new PEN();
        p1.colour="Red";
        p1.type="Gel";
        
        p1.write();
        p1.printcolour();
        p1.printtype();
    }
}