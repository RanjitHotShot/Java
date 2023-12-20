package oops;
class Students{
    String name;
    static String Schoolname;//same for all objects

    public static void changeSchool(){
        Schoolname="DBMS";
    }
}
public class oops7{
    public static void main(String[] args)
    {
        Students.Schoolname="Rajendra Vidyalaya";
        Students student1=new Students(); 
        student1.name="Ranjit Singh";
        System.out.println(student1.name);
        System.out.println(Students.Schoolname);

        Students.changeSchool();
        System.out.println(Students.Schoolname);
    }
}