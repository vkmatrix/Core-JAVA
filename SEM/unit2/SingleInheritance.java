package unit2;

class p  //parent class
{
    int id;
    String name;
    p()
    {
        id=4;
        name="ALMAS";
    }
}
class q extends p  //subclass
{
    String dept;
    q()
    {
        super();  // accesses members of parent class
        dept="AIDS";
    }
}

public class SingleInheritance 
{
    public static void main(String[] ar) {
        q o1=new q();
        System.out.println(o1.id);
        System.out.println(o1.name);
    }    
}
