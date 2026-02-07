package Static.StaticVariables;

public class StaticExample {
    static int var1;
    int var2;

    public static void main(String[]args){

        StaticExample obj = new StaticExample();
        obj.var1=10;
        obj.var2=20;


        StaticExample obj2 = new StaticExample();
        obj2.var1=30;
        obj2.var2=40;

        System.out.println(obj.var1);
        System.out.println(obj.var2);

        System.out.println(obj2.var1);
        System.out.println(obj2.var2);


        StaticExample obj3 = new StaticExample();
        obj3.var1=50;
        obj3.var2=60;

        System.out.println(obj3.var1);
        System.out.println(obj3.var2);



    }
}
