package enumClass;

public enum  EnumConstructor {

    iphone,oppo,samsung,vivo;

    EnumConstructor(){
        System.out.println("constructor call");
    }
}
class TestConstructor{

    public static void main(String[] args) {
        EnumConstructor obj = EnumConstructor.samsung;

        System.out.println(obj);

        System.out.println("hello");
    }
}
