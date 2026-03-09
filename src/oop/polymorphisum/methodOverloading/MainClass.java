package oop.polymorphisum.methodOverloading;

class SuperClass
{
    void superClassMethod(Number n)
    {
        System.out.println("From Super Class");
        System.out.println(n);
    }
}


class SubClass extends SuperClass
{
    void superClassMethod(Double d)
    {
        System.out.println("From Sub Class");
        System.out.println(d);
    }
}


public class MainClass
{
    public static void main(String[] args)
    {

        SuperClass sub = new SubClass();

        sub.superClassMethod(123321.345654D);
    }
}
