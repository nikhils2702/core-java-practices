package ObjectClass.CloneMethod;

public class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student implements Cloneable {
        String name;
        Address Addr;

        Student(String name, Address Addr) {
            this.name = name;
            this.Addr = Addr;
        }

        public Object clone() throws CloneNotSupportedException {
            Student clone = (Student) super.clone();

            clone.Addr = new Address(this.Addr.city);

            return clone;

        }

        public static void main(String[] args)throws CloneNotSupportedException {

            try {
                // 1. Setup Original Data
                Address puneAddress = new Address("Pune");
                Student student1 = new Student("Nikhil", puneAddress);
//
                // 2. Perform the Deep Clone
                Student student2 = (Student) student1.clone();

                // 3. The Test: Change the clone's address
                student2.Addr.city = "Mumbai";

                // 4. Check the Results
                System.out.println("Original Student City: " + student1.Addr.city); // Should stay Pune
                System.out.println("Cloned Student City: " + student2.Addr.city);   // Should be Mumbai

            } catch (CloneNotSupportedException cnse) {
                cnse.printStackTrace();
            }
        }
    }

