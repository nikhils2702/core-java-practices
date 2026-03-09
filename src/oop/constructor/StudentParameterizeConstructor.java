package oop.constructor;

public class StudentParameterizeConstructor {

    String name;
    String SchoolName;
    int Std;
    String city;


    // first manner
    public StudentParameterizeConstructor(String name, String SchoolName, int Std, String city) {

        // 'this' refers to the current object.
        // The '.'called attribute's identifier selects the variables name, schoolName, std, city from the current object.

        System.out.println("Constructor call....");
        this.name = name;
        this.SchoolName = SchoolName;
        this.Std = Std;
        this.city = city;
    }


//         Second manner

//        public StudentParameterizeConstructor(String n, String scn , int s, String c){
//
//            name = n;
//            SchoolName = scn;
//            Std = s;
//            city = c;
//
//        }

        void display(){

        System.out.println(name+ " "+ SchoolName+ " "+ Std+ " "+ city);
        }

        public static void main(String[]args) {
            StudentParameterizeConstructor obj = new StudentParameterizeConstructor("Nik","DYP",15,"pune");

            obj.display();



        }


    }

