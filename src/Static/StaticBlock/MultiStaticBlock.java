package Static.StaticBlock;


public class MultiStaticBlock {
    static{
        System.out.println("I am first static block");
    }
    static{
        System.out.println("I am second static block");
    }
    static{
        System.out.println("I am third static block");
    }

    public static void main(String[] args){
        System.out.println("I am main methode");
    }
}
