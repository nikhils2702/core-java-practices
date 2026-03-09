package oop.constructor;

public class NonParameterizeConstructorPerson {

    int age;
    String name;
    String address;

    // Declare non parameterize constructor

    NonParameterizeConstructorPerson(){
        int age = 25;           // initialize parameterize constructor
        String name = "Nik";
        String address = "pune";

        System.out.println(age + " "+ name +" "+ address);
    }

    public static void main(String[]args){

        // Create object of class and call default constructor
        NonParameterizeConstructorPerson obj = new NonParameterizeConstructorPerson();
          // reference - Stack area       =  object - heap area
    }

}
