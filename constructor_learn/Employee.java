package constructor_learn;

 class employee1

{   private int id;
    private String name;
   private String companyName;


   employee1()
   {id =1201;
    name="Kapil";
    companyName="Amazon";
    System.out.println("Constructor called ");
    
   }

   void settor(int i,String n,String c)
   {
    id=i;
    name=n;
    companyName=c;
   
   }
   
//    employee1(int ID,String Name,String c)
//    {
//     id =ID;
//     name=Name;
//     companyName=c;
//    }
    
    void print()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(companyName);

    }
}

public class Employee {
    public static void main(String[] args) {
        
        // employee1 ref = new employee1(101,"Adarsh","google");
        employee1 ref = new employee1();
        // ref.id = 101;
        // ref.name="Adarsh";
        // ref.companyName="Microsoft";
        // ref.settor(101, "Adarsh", "Google");
        ref.print();

   
   
   
    }

}
