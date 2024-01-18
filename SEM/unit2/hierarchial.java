package unit2;

class university
{
    void welcome()
    {
        System.out.println("welcome to university(SUPERCLASS)");
    }
}
class engineering extends university
{
    void welcomeEngineering()
    {
        System.out.println("welcome to engineering(SUBCLASS)");
    }
}
class arts extends university
{
    void welcomeArts()
    {
        System.out.println("welcome to arts");
    }
}

public class hierarchial {
    public static void main(String[] ar) {
        engineering o1=new engineering();
        o1.welcomeEngineering(); // subclass method call
        o1.welcome(); // superclass method call using subclass object
    }
}
