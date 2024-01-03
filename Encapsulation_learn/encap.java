package Encapsulation_learn;

class employee
{
    String name;
    int id;

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
     public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
}

public class encap {
    
    public static void main(String[] args) {
        
        employee E = new employee();
        E.setName("Ajay");
        E.setId(101);
        System.out.println(E.getName());
        System.out.println(E.getId());
    }
}
