package Inheritance_learn;

class vehicle
{
    String name;
    int model;
    String color;

    public vehicle(String name,int model,String color)
    {
        this.name =name;
        this.model=model;
        this.color=color;
        System.out.println("vehicle.vehicle()");
    }
    void start()
    {
        System.out.println(name+" Start...........");

    }
      void music()
    {
        System.out.println(name+" playing music...........");
    }
      void stop()
    {
        System.out.println(name+" stop...........");
    }
}
class Fortuner extends vehicle
{
    public Fortuner(String name,int model,String color)
    {
        super(name, model, color);
        System.out.println("Fortuner.Fortuner()");
    }

}

public class singleiherit {
    public static void main(String[] args) {
        Fortuner f = new Fortuner("Fortuner",2014, "Black");
        f.start();
        f.music();
        f.stop();
        System.out.println("main....");
    }
}
