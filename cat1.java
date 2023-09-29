class carnivore   // SUPERCLASS
{
    String cname;
    carnivore(String val)
    {
        cname=val;
    }
   
    void atype()
    {
        System.out.println(cname+" eats meat");
    }
}
class dog extends carnivore      // SUBCLASS
{

    String dname;
    dog(String name)
    {
        super(name);           // super constructor to call superclass constructor
        dname=name;
    }
    void dtype()
    {
        System.out.println(dname+" barks");
    }
}
class bahourdog extends dog
{
    String ldname;
    bahourdog(String name)
    {
        super(name);
        ldname=name;
    }
    void loves()
    {
        System.out.println(ldname+" loves chocobar");
    }
}
public class cat1 {
    public static void main(String[] args)
    {
        bahourdog abilash=new bahourdog("abilash");

        abilash.atype();
        abilash.dtype();
        abilash.loves();
    }
    
}
