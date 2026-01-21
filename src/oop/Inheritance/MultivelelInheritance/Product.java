package oop.Inheritance.MultivelelInheritance;

public class Product {
    int ID = 123;
    void ProductInfo(){
        System.out.println("Product " + ID );
    }
}
class Electronics extends Product{
    void ElectronicsInfo() {
        int fridge = 23000;
        System.out.println("frridgePrice " + fridge);
    }
}
class Model extends Electronics{
    void ModelInfo(){
        ProductInfo();
        ElectronicsInfo();

        System.out.println("Model 2023 ");
    }

    public static void main(String[]args){
        Model obj = new Model();
        obj.ModelInfo();
    }
}