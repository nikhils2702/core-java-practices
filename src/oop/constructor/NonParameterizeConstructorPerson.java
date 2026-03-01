package oop.constructor;

public class ParameterizeConstructorPerson {

    int age;
    String name;
    String address;

    // Declare non parameterize constructor

    ParameterizeConstructorPerson(){
        int age = 25;           // initialize parameterize constructor
        String name = "Nik";
        String address = "pune";

        System.out.println(age + " "+ name +" "+ address);
    }

    public static void main(String[]args){

        // Create object of class and call default constructor
        ParameterizeConstructorPerson obj = new ParameterizeConstructorPerson();
          // reference - Stack area       =  object - heap area
    }

}
