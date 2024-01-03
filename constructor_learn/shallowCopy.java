package constructor_learn;

class Address1 implements Cloneable
{
    String name;
    int pincode;

public Address1(String  name,int pincode){
    this.name=name;
    this.pincode=pincode;
}

@Override
public String toString() {
    return "Address1 [name=" + name + ", pincode=" + pincode + "]";
}

@Override
protected Object clone() throws CloneNotSupportedException {
    return super.clone();
}

}

public class shallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address1 ab =  new Address1("GZB",201301);
        Address1 ab1= (Address1)ab.clone();

        ab.name="Noida";
        System.out.println(ab);
        System.out.println(ab1);

    }
}
