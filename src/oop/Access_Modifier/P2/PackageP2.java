package oop.Access_Modifier.P2;

import oop.Access_Modifier.P1.PackageP1;

public class PackageP2 extends PackageP1 {
    private void privateMethodP2(){
        System.out.println("This is private Method of public class");
    }
    public static void main(String[]args){
        PackageP2 obj = new PackageP2();
//        obj.defaultMethodP11();  // Default method Different package subclass. error
          obj.protectedMethodP11();  // protected method Different package subclass.
    }
}

class PackageP2NonePublicClass {
    private void privateMethodP2() {
        System.out.println("This is private Method of Default class");
    }
}