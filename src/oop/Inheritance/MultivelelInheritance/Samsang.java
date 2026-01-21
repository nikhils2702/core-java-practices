package oop.Inheritance.MultivelelInheritance;

public class Samsang {
    void MobileInfo(){
        System.out.println("6GB RAM 128GB ROM");
    }
}
class MobileColor extends Samsang{
    void ColorInfo(){
        System.out.println("Mobile Phone Color is SkyBlue");
    }
}
class MobileProssessor extends MobileColor{
    void ProssessorInfo(){
        ColorInfo();
        MobileInfo();
        System.out.println("Mobile Prossessor is Snapdragon 733");
    }

    public static void main(String[]args){
        MobileProssessor obj=new MobileProssessor();
        obj.ProssessorInfo();
    }
}
