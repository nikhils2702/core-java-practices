package innerClass.anonymousInnerClass;

public class Cars {

    public void methodOne(){
        System.out.println(" Super cars....");
    }
}
class Vehical{

    public static void main(String[] args) {

        Cars obj = new Cars(){

            public void methodOne(){
                System.out.println(" offroad vhehical");
            }
        };

        Cars obj1 = new Cars(){

            public void methodOne(){
                System.out.println(" truck... ");
            }
        };

        obj.methodOne();

        obj1.methodOne();

        Cars obj2 = new Cars();

        obj2.methodOne();


        Cars obj3 = new Cars(){

            public void methodOne() {
                System.out.println(" Luxury cars");
            }
        };

        obj3.methodOne();

        System.out.println(obj.getClass().getName());
        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass().getName());

    }
}
