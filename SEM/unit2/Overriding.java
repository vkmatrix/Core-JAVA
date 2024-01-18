package unit2;

class Animal
{
    void makeSound()
    {
        System.out.println("ANIMALS MAKE NON HUMAN SOUNDS");
    }
}

class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("DOGS BARK!!!!!");
    }
    void foodType()
    {
        System.out.println("DOGS ARE CARNIVORE");
    }
}

class Snake extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("SNAKES HISS!!!!!");
    }
} 

public class Overriding
{
    public static void main(String[] ar) 
    {
        Animal a=new Animal();
        a.makeSound(); // direct parentclass method
        Dog d=new Dog();
        d.makeSound(); // overriden parentclass method 
    }
}