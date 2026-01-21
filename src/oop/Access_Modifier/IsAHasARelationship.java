package oop.Access_Modifier;

class Car {
void applyBrak(){

}
public static void main(String[] args ){
   Engine obj = new Engine();  //HAS-A relationship
   obj.startEngine();
}
}
class Engine{
    void startEngine(){  }
}
class Nexon extends Car{

}

public class IsAHasARelationship {


}
