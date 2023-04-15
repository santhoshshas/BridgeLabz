package com.Program.Day9;

import java.util.Scanner;

public class Address {
    public static void main(String[] args){


        System.out.println("Welcome to Address ");
        Person obj1 = new Person();


        obj1.setFirstname("Santhosh");
        System.out.println(obj1.getFirstname());
        obj1.setLastname("Kumar");
        System.out.println(obj1.getLastname());
        obj1.setAddress("KPS PONNS VILLA");
        System.out.println(obj1.getAddress());
        obj1.setCity("Nagapattinam");
        System.out.println(obj1.getCity());
        obj1.setState("TN");
        System.out.println(obj1.getState());
        obj1.setZipcode(611-001);
        System.out.println(obj1.getZipcode());
        obj1.setPhoneno(000000);
        System.out.println(obj1.getPhoneno());
        obj1.setEmail("santhoshshas920@gmail.com");
        System.out.println(obj1.getEmail());

        Person obj2 = new Person();
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the First name ");
        obj2.setFirstname(obj.next());
        System.out.println("enter the Last name ");
        obj2.setLastname(obj.next());
        System.out.println("enter the Address ");
        obj2.setAddress(obj.next());
        System.out.println("enter the city ");
        obj2.setCity(obj.next());
        System.out.println("enter the State ");
        obj2.setState(obj.next());
        System.out.println("enter the Zipcode ");
        obj2.setZipcode(obj.nextInt());
        System.out.println("enter the PhoneNo ");
        obj2.setPhoneno(obj.nextInt());
        System.out.println("enter the  Email");
        obj2.setEmail(obj.next());


    }
}
