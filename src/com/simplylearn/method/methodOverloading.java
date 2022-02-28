
package com.simplylearn.method;

public class methodOverloading {
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;

    }
    public float add(float a,float b)
    {
        return a+b;
    }
    public float add(float a,float b,float c)
    {
        return a+b+c;

    }
    public double add(double a,double b)
    {
        return a+b;
    }
    public double add(double a,double b,double c)
    {
        return a+b+c;

    }
    public static void main(String[] args) {
        methodOverloading m= new methodOverloading();
        System.out.println("add 2 int"+m.add(3, 6));
        System.out.println("add 3 int"+m.add(3, 6, 8));
        System.out.println("add 2 float"+m.add(3.0f, 6.8f));
        System.out.println("add 2 double"+m.add(4.5, 7.8));
    }




}