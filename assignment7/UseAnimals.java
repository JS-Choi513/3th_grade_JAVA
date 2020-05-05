package assignment7;

 class Animal {
    public void callme()
    {
        System.out.println("In callme of Animal");
    }
}

class Dog extends Animal 
{ 
    public void callme()
    {
        System.out.println("In callme of Dog");
    }

    public void callme2()
    {
        System.out.println("In callme2 of Dog");
    }
}

public class UseAnimals 
{
    public static void main (String [] args) 
    {
        Dog d = new Dog();      
        Animal a = d;
        d.callme();
        a.callme();
        ((Dog) a).callme2();
    }
}