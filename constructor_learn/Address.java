package constructor_learn;
class Address2 implements Cloneable{

    String country;

public Address2(String country)
{
    this.country= country;
}

@Override
protected Object clone() throws CloneNotSupportedException {
    return super.clone();
}

@Override
public String toString() {
    return "Address2 [country=" + country + "]";
}



}

public class Address implements Cloneable
{
    String city;
    int pincode;
    Address2 a2;

public Address(String  city,int pincode ,Address2 a2 ){
    this.city=city;
    this.pincode=pincode;
    this.a2=a2;
}


@Override
public String toString() {
    return "Address [city=" + city + ", pincode=" + pincode + ", a2=" + a2 + "]";
}


@Override
protected Object clone() throws CloneNotSupportedException {
    Address p=(Address)super.clone();
    p.a2=(Address2)p.a2.clone();

    return p;
    
}


    public static void main(String[] args) throws CloneNotSupportedException {
        Address2 A2=new  Address2("India");
        Address add1 =  new Address("GZB",201301,A2);
        Address add2= (Address)add1.clone();

        add1.city="Noida";
        add1.a2.country="UK";

        System.out.println(add1);
        System.out.println(add2);

    }
}
