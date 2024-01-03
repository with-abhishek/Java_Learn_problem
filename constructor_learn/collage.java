package constructor_learn;
class  Student
{   private int  id;
    private String name;
    private String branch;
    
    public Student()
    {   id = 101;
        name="Ajay";
        branch="cse";
        System.out.println("\nDefault constructor called");
    }
    public Student(int id,String name, String branch)
    {
        this.id=id;
        this.name=name;
        this.branch=branch;
         System.out.println("\nParameterized constructor called");

    }
    void print()
    {
        System.out.print(id+" ");
        System.out.print(name+" ");
        System.out.print(branch+" ");
    }

}

public class collage {
    public static void main(String[] args) {
        Student ref = new Student();
        ref.print();
        Student Aman = new Student(102, "Adarsh","cse" );
        Aman.print();
        Student Aryan = new Student(103, "Arpit","cse" );
        Aryan.print();
        Student Ayansh = new Student(104, "kapil","cse" );
        Ayansh.print();
    }
}
