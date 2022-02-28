
package com.simplylearn.method;

public class student {
    //class level variables
    int id;
    String name;

    //default constructor
    public student()
    {
        id=23;
        name="Jayesh";
    }
    public student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {

        //when you create object automatically it calls default constructor
        //if no default constructor then compiler will create that
        student obj=new student();
        System.out.println("User 1");
        System.out.println("Id: "+obj.id);
        System.out.println("Name: "+obj.name);

        student obj2= new student(45,"ajay");
        System.out.println("User 2");
        System.out.println("Id: "+obj2.id);
        System.out.println("Name: "+obj2.name);



    }
}

