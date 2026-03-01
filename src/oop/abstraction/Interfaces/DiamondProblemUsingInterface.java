package oop.abstraction.Interfaces;


interface BB1{
    void Display();

}
interface BB2{
    void Display();

}

public class DimondProblemUsingInterface implements BB1, BB1  {
    public void Display()
        {
        System.out.println("Dimond problem using interface");
        }
}
