package Static.StaticMethods;

public class StaticMethodeTest {

    static void  StaticMethodeTest() {

        System.out.println("Static Methode Test complete ");
    }

    public  static void main(String[]args){

        StaticMethodeTest();  // methode call same class using only methode name.
        XYZ.displayStaticMethod(); //methode call another class using class name.
    }
}

class XYZ{

    static void displayStaticMethod (){

        System.out.println("display Static Method from another class ");
    }
}
