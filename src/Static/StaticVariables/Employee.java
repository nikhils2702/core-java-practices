package Static.StaticVariables;

public class Employee {

    int id ;
    String name;
    static String company = "Tesla";

    Employee(int id,String name){
        this. id = id;
        this.name = name;
//        this.company = company;

    }
    void Display(){
        System.out.println(id +" " +name +" "+company);

    }

    public static void main(String[]args){
        Employee e = new Employee(101, "john");
        e.Display();

        Employee e1 = new Employee(102,"tonny");
        e1.Display();
    }
}
