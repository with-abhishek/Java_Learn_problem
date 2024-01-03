package Interface_learn;

interface Animal {

    // variable is used always as a final keyword ....
    String name = "Animal";

    // method is used a default with public abstract protype
    void eat();

    void run();

    void sleep();

    public static void drink() {
        System.out.println("Drinking......");
    }

}

class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Eatting...........");
    }

    @Override
    public void run() {
        System.out.println("Running...........");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...........");
    }

}

public class interfaceEx {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println(Animal.name);
        d.eat();
        d.run();
        d.sleep();

    }

}
