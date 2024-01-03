package Method_chaining;
public class Student1 {
private int id;
private String name;
private String branch;

public Student1 setId(int id)
{
    this.id=id;
    return this;
}
public Student1 setName(String name)
{
    this.name=name;
    return this;
}
public Student1 setBranch(String branch)
{
    this.branch=branch;
    return this;
}
public void display()
{
    System.out.println("Display called !! ");
    System.out.println(id +" "+name+" "+" "+ branch);
    
}
public static void main(String[] args) {
    Student1 sd = new Student1();
    sd.setId(101).setName("Harry").setBranch("CSE").display();
    System.out.println("Main");
}


}
