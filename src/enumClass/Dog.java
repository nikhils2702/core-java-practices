package enumClass;

public enum Dog {

    LabroDog,
    germanShepard,
    karvani,
    americanPetBull;

    public static void main(String[] args) {

        System.out.println("enum main() method call");

        Dog obj = Dog.LabroDog;

        System.out.println(obj);
    }


}
