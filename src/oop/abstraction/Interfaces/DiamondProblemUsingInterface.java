package oop.abstraction.Interfaces;


interface BB1{
    void Display();

}
interface BB2{
    void Display();
    //void show();

}

public class DiamondProblemUsingInterface implements BB1,BB2  {
    public void Display()
        {
        System.out.println("Diamond problem using interface");
        }
}
//    public void show()
//    {
//        System.out.println("Diamond problem using interface");
//    }
