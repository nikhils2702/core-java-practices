package oop.abstraction.Interfaces;


interface a1{
    void a();
}

interface a2{
    void b();
    void c();
}
interface a3 extends a1,a2{
    int d();
}
public class OneClassImplimentsMultipleInterface {

    public int d(){
        return 1;
    }
    public void a (){

    }
    public void b(){
        System.out.println("b methode");
    }
    public void c(){

    }


}
