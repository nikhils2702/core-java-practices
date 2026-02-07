package Static.StaticBlock;



public class StaticTest {

    static{         // static methode execute before main methode
        System.out.println("This is static block");
    }

    static void staticMethod(){

        System.out.println("This is static method");
    }

    public static void main(String[]args){
          System.out.println("This is Main methode");
          staticMethod();
    }

    static{
        System.out.println("Second static block");
    }
}
