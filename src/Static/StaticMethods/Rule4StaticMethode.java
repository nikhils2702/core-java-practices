package Static.StaticMethods;

// Static methode call only static methods and cannot call a non-static methode.

public class Rule4StaticMethode {

    static void displayStaticMethod(){

        System.out.println(" class displayStaticMethod");
    }

    void displayNonStaticMethod(){

        System.out.println("class displayNonStaticMethod");
    }

    public static void main(String[] args){
        displayStaticMethod();

        Rule4StaticMethode obj = new Rule4StaticMethode();
        obj.displayNonStaticMethod();
    }
}


