package oops;
interface Animals{
   public void walks();
}
class Horse implements Animals{
    public void walks(){
        System.out.println("Walks on all fours");
    }

}
public class oops6{
    public static void main(String[] args)
    {
        Horse h=new Horse();
        h.walks();

    }
}