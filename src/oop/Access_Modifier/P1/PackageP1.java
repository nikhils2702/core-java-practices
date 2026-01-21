package oop.Access_Modifier.P1;

public class PackageP1 {
    private void privateMethodP11(){
        System.out.println("This is private Method of public class");
    }
    void defaultMethodP11(){
        System.out.println("This is default Method of public class");
    }
    protected void protectedMethodP11(){
        System.out.println("This is protected Method of public class");
    }
}

class PackageP1NonePublicClass extends PackageP1{
    private void privateMethodP12(){
        System.out.println("This is private Method of Default class");
    }

    public static void main(String[] args) {
        PackageP1NonePublicClass obj = new PackageP1NonePublicClass();
       // obj.privateMethodP11();    // Private Methode Do not access out of the class.
        obj.privateMethodP12();

        obj.defaultMethodP11();
        obj.protectedMethodP11();  // protected method call same package sub Class.
    }
}

class NonSubclass{  // Has-A relationship/ Non Subclass
    public static void main(String[] args){
        PackageP1 obj = new PackageP1();
          obj.defaultMethodP11();
          obj.protectedMethodP11(); // protected method call NonSame class.
    }
}
