package ObjectClass.CloneMethod.copy.ShalloCopy;

public class Course {
    String Sub;

    Course(String Sub){
        this.Sub=Sub;
    }
}
class Student implements Cloneable{
    String name;
    Course Cour;

    Student(String name, Course Cour){
        this.name=name;
        this.Cour=Cour;
    }

    Student(Student other){
        this.name=name;
        this.Cour = Cour;
    }

    public Object Clone() throws CloneNotSupportedException{
        Student obj = (Student)super.clone();

        obj.Cour = new Course(this.Cour.Sub);
        return obj;
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Course math = new Course("Math");
        Student s1 = new Student("Nikhil", math);

        // --- SHALLOW COPY ---
        // Just copying the reference. Both point to the same 'math' object.
        Student shallow = s1;

        // --- DEEP COPY (via Constructor) ---
        // Totally independent.
        Student deep = new Student(s1);

        // --- CLONE METHOD ---
        // Also independent (because we wrote the deep logic in clone()).
        Student cloned = (Student) s1.clone();

        // THE TEST: Change s1's subject
        s1.Cour.Sub = "Science";

        System.out.println("S1 Subject: " + s1.Cour.Sub);      // Science
        System.out.println("Shallow Subject: " + shallow.Cour.Sub); // Science (Linked!)
        System.out.println("Deep Subject: " + deep.Cour.Sub);       // Math (Independent!)
        System.out.println("Clone Subject: " + cloned.Cour.Sub);     // Math (Independent!)
    }

    }


