package unit2;
class a
{
    int id;
    a()
    {
        id=211269;
    }
}
class b extends a
{
    String name;
    b()
    {
        super();
        name="Windows";
    }
}
class c extends b
{
    int age;
    c()
    {
        super();
        age=8;
    }
}
public class multi 
{
    public static void main(String[] ar) {
        c o1=new c();
        System.out.println(o1.id);
        System.out.println(o1.name);
    }
}
