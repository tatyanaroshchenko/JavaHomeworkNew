package Homework3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Address Person1 = new Address("Mike", "Podgornij",
                "employee", "380501110022");
        //System.out.println(Person1.getName());
        //System.out.println(Person1.getFamilyName());
        //System.out.println(Person1.getSocialStatus());
        //System.out.println(Person1.getNumberOfPhone());
        System.out.println(Person1.toString());
        Address Person2 = new Address ("Alex", "Smith",
                "employee", "380934530011");
        System.out.println(Person1.hashCode());
        System.out.println(Person2.hashCode());
        System.out.println(Person1.equals(Person2));
        Person2 = Person1;
        System.out.println(Person1.equals(Person2));


    }

}
