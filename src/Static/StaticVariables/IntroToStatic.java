package Static.StaticVariables;

public class IntroToStatic {

    int instance = 2000;   // constructor provide default value of instance variable
    static int staticVar = 20001;

    void instanceMethode(){
         System.out.println("This is instance");

         instance = 400;
         staticVar = 1000;

    }

    static void staticMethode(){

        System.out.println("This is static methode");

        IntroToStatic obj = new IntroToStatic();

        obj.instance = 5000;
        staticVar = 10000;


    }

    public static void main(String[] args){
        staticMethode();
//        instanceMethode();


    }
}
