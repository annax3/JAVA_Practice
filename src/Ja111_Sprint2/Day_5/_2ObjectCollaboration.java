package Ja111_Sprint2.Day_5;

import Ja111_Sprint2.Day_4.Day4Preclass.A;

public class _2ObjectCollaboration {
    public static void main(String[] args) {
        Person person = new Person();
        person.name="Anna";
        person.city="Delhi";
        person.zip="10058";
        System.out.println(person.city);

        Office office= new Office();
        office.companyName="Amazon";
        Address amazonAddress=new Address();
       amazonAddress.city="BLR";
       amazonAddress.zip="456456";
       office.address=amazonAddress;
        System.out.println(office.companyName);
        System.out.println(office.address.city);
        System.out.println(amazonAddress.city);
    }
}
class Person{
    String name;
    String city;
    String zip;
}
class Address{
    String city;
    String zip;
}
//2*10+3*10 => take common outside => 10*(2+3)
class Office{
    String companyName;
    Address address;//composition
    //static inner class, it restricts the reuse of the address class.
    /*static class Address{
        String city;
        String zip;
    }*/
}

//Nest Eggs
class Nest{
    Egg[] eggs;//composition : ensures that one object is put into other object
}
class Egg{}