package oop.Access_Modifier;

class ParentClass{
    private void test(){   // Private access modifier use
        System.out.println("test method of ParentClass");
    }

    public void test1(){  //public access modifier use
        System.out.println("test method of ParentClass2");
    }

    void test2(){// Default access modifier use.
        System.out.println("test method of ParentClass3");
    }

    public static void main(String[] args){
        ParentClass obj=new ParentClass();
        obj.test();
    }

}
public class IntroToAccessModifier extends ParentClass {

    public static void main(String[] args) {
        IntroToAccessModifier obj = new IntroToAccessModifier();
        obj.test1();
        obj.test2();
    }

}
