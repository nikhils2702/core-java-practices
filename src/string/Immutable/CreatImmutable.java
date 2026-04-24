package string.Immutable;

public final class CreatImmutable {

    private int i;

    CreatImmutable(int i) {

        this.i = i;
    }

    public CreatImmutable modify(int i) {
        if (this.i == i) {
            return this;
        } else {
            return(new CreatImmutable(i));
        }
    }

    public static void main(String[] args) {
        CreatImmutable obj = new CreatImmutable(10);

        CreatImmutable obj1= obj.modify(100);
        CreatImmutable obj2= obj.modify(10);

        System.out.println(obj == obj1);
        System.out.println(obj==obj2);

        CreatImmutable obj3=obj.modify(100);

        System.out.println(obj3 == obj1);


    }
}
