class Student{
    String name;
    String gender;
    int age;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.age);
    }
    Student(Student s1){
        this.name=s1.name;
        this.age=s1.age;
    }
    Student(){

    }
} 
public class oops{
    public static void main(String[] srgs)
    {   
        Student s1=new Student();
        s1.name="Ranjit";
        s1.gender="Male";
        s1.age=21;

        Student s2=new Student();
        s2.name="Mrigank";
        s2.gender="Female";
        s2.age=20;

        s1.info();
        s2.info();
    }
}