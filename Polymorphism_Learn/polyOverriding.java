package Polymorphism_Learn;

class animal

{
    String name ;

    public animal(String name)
    {
        this.name =name;
        System.out.println("animal.animal()");
    }
    void eat()
    {
        System.out.println(name+ " can eat.....");
    }
    public void run()
    {
        System.out.println(name+ " can run..........");
    }
}
class dog extends animal{
    public dog(String name)
    {
        super(name);
    }
        @Override
       public void eat()
    {
       System.out.println(name+" can eat both veg & non-veg........");
    }
}

public class polyOverriding {
    public static void main(String[] args) {
        
        dog d= new dog("husky");
        d.eat();
        d.run();

    }
}
