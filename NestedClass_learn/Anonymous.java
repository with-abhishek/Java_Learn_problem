package NestedClass_learn;

abstract class Birds{

    public abstract void eat();
    public abstract void fly();
    public abstract void sleep();

}

public class Anonymous {

    public static void main(String[] args) {
        
        Birds B = new Birds() {

            @Override
            public void eat() {
            System.out.println("Birds.eat()");
            }

            @Override
            public void fly() {
             System.out.println("Birds.fly()");
            }

            @Override
            public void sleep() {
            System.out.println("Birds.sleep()");

            }
            
        };
        B.eat();
        B.fly();
        B.sleep();
    }
    
}
