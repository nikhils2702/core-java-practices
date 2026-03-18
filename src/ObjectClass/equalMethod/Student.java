package ObjectClass.equalMethod;

public class Student {

    String name;
    int rollno;


    public Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public boolean equals(Object obj){

        try {
            String name1 = this.name;
            int rollno1 = this.rollno;
            Student s2 = (Student) obj;

            String name2 = this.name;
            int rollno2 = this.rollno;

            if (name1.equals(name2) && rollno2 == rollno1) {
                return true;
            } else return false;
        }

            catch(ClassCastException e) {
            return false;
            }
            catch(NullPointerException e) {
            return false;
    }
    }

    public static void main(String[] args) {
        Student s1 =new Student("viki", 23);
        Student s2 =new Student("nik", 25);
        Student s3 =new Student("sumi", 27);
        Student s4= s1;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals("viki"));
        System.out.println(s1.equals(null));


    }
}
