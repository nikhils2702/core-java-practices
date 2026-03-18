package ObjectClass.toStringMethod;

public class Test {
    private int age;
    private String name;
    private double salary;

    Test(){

    }

    public Test(int age, String name,double salary){
        this.age =age;
        this.name=name;
        this.salary=salary;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
       this.age=age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary = salary;
    }

    public String toString(){
        return  age + name + salary;
    }

    public static void main(String[] args) {
        Test obj = new Test(100,"java",20.333);

        String result = obj.toString();

        System.out.println(result);
    }

}
