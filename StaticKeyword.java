class student
{
    int rno;
    String name;
    static String college="SMVEC";  //  *** static variable that is same for all objects of the class
    student(int rn,String nm)  // constructor
    {
        rno=rn;
        name=nm;
    }

    public static void changeCollege(String newvalue)  //  *** static method
    {
        college=newvalue;
    }

}
public class StaticKeyword{
    static
    {
        System.out.println("static block gets executed before main method");
    }
    public static void main(String[] ar)
    {
        student s1=new student(100,"hacker");
        System.out.println("RollNo ->"+ s1.rno+" name ->"+s1.name +" college->"+s1.college);   // same college
        student s2=new student(200,"vidhun");
        System.out.println("RollNo ->"+ s2.rno+" name ->"+s2.name +" college->"+s2.college);   // same college

        System.out.println(" After invoking the static method  changeCollege");

        // calling the static method
        s1.changeCollege("NIT");
        s2.changeCollege("IIT");

        System.out.println("RollNo ->"+ s1.rno+" name ->"+s1.name +" college->"+s1.college);
        System.out.println("RollNo ->"+ s1.rno+" name ->"+s1.name +" college->"+s1.college);

    }
    
}
