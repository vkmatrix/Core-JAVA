package unit2;

class x
{
    int id;
    x(int val)
    {
        id=val;
    }
}
class y extends x
{
    String name;
    y(int l,String sname)
    {
        super(l);
        name=sname;

    }
    void charCount()
    {
        System.out.println("no of charecters in "+name+" : "+name.length());
    }
}
class z extends y
{
    String sex;
    z(int id,String sname,String ssex)
    {
        super(id,sname);
        sex=ssex;
    }
}

public class MultilevelInheritance {
    public static void main(String[] ar) {
        z o1=new z(1,"ALMAS","QUEER");
        o1.charCount();
        
    }
    
}
