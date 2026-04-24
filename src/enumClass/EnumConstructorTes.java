package enumClass;

public enum EnumConstructorTes {

    jon(78), chtaz(56), nik(89), ion(90);

    int mark;

    EnumConstructorTes(int mark) {
        this.mark = mark;

    }

    EnumConstructorTes() {

    }

    public int getMark() {

        return mark;
    }
}
class Test{


    public static void main(String[] args) {
        EnumConstructorTes[] obj = EnumConstructorTes.values();

        for(EnumConstructorTes obj1: obj){

            System.out.println(obj1 +"----"+obj);

        }
    }
}



