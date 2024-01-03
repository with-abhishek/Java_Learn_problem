package SingletonClass;

class Test
{
    private Test()
    {
        System.out.println("hiii...");
    }
    // Early  loading/Instatiation
    // static Test inst = new Test();

    // Lazy loading/Instatiaton
    static Test inst;

    public static Test getInstance()
    {
        if(inst==null)
        {
         inst = new Test();
        }
        // inst = new Test();
        return inst;
    }
}

public class Singleton {

    public static void main(String[] args) {
        Test t1 = Test.getInstance();
        Test t2 = Test.getInstance();
        Test t3 = Test.getInstance();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
    
}
