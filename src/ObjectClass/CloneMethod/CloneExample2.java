package ObjectClass.CloneMethod;

class Test implements Cloneable {
    int i;
    int j;

    public Test(int i, int j){
        this.i = i;
        this.j = j;
    }
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class CloneExample2 {

    public static void main(String[]args){

        Test obj = new Test(10,20);

        Test obj2 = null;

        try{
            obj2 =(Test) obj.clone();
        }
        catch (CloneNotSupportedException e){

            System.out.println("object is not clone Able");

        }
        System.out.println(obj2.i);  //10
        System.out.println(obj2.j);  //20


    }

}
