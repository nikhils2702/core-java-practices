public class Address {
    String city = "New York";
}

class Student {
    public static void main(String[] args) {
        int age = 20;
        Address addr = new Address();
    }

    // EXECUTION
    Student student1 = new Student();
    Student student2 = student1; // SHALLOW COPY

//    student2.addr.city ="London";
//
//// Output:
//        System.out.println(student1.addr.city); // Prints "London"!
}