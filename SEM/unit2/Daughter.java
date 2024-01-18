package unit2;
// HYBRID combination of 2 or more eg., MULTILEVEL+HIERARCHIAL

//parent class
class GrandFather  
{  
public void gfshow()  
{  
System.out.println("I am grandfather property.");  
}  
}  
//inherits GrandFather properties  
class Father extends GrandFather  
{  
public void fshow()  
{  
System.out.println("I am father property.");  
}  
}  
//inherits Father properties  
class Son extends Father  
{  
public void sshow()  
{  
System.out.println("I am son property.");  
}  
}  
//inherits Father properties  
public class Daughter extends Father  
{  
public void dshow()  
{  
System.out.println("I am a daughter property.");  
}  
public static void main(String args[])  
{  
Daughter obj = new Daughter();  //daughter object can inherit both father and grandfather property
obj.dshow(); // own property
obj.fshow(); //father property
obj.gfshow(); //grandfather property 
}  
}  