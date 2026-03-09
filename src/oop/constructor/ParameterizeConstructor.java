package oop.constructor;

public class ParameterizeConstructor {

    ParameterizeConstructor(){
        System.out.println("No argument constructor");
    }

    ParameterizeConstructor(int a){
        System.out.println("One argument Constructor");
        System.out.println(a);
    }

    ParameterizeConstructor(int a, int b){
        System.out.println("Two argument constructor");
        System.out.println(a+ " " + b);
    }

    public static void main(String[]args){
        ParameterizeConstructor obj = new ParameterizeConstructor();
                                obj = new ParameterizeConstructor(9);
                                obj = new ParameterizeConstructor(45, 54);
    }


}
