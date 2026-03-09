package ObjectClass;

public class ToStringMethod {
    String name;
    int rollNo;

    ToStringMethod(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "ToStringMethod{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public static void main(String[] args){
        ToStringMethod s1 = new ToStringMethod("Nikhil",27);
        ToStringMethod s2 = new ToStringMethod("Shinde",45);


        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);

    }
}
