package string;

public class SingleCopyExample {
    String name ;
    String sirName;
    static String collageName ;
    static String city ;

    public SingleCopyExample(String name, String sirName,String collageName, String  city ){
        this.name = name;
        this.sirName= sirName;
        this.collageName = collageName;
        this.city = city;

    }
    void dataStudent(){
        System.out.println(name+" " + sirName+" " + collageName+" " + city);
    }

//    @Override
//    public String toString() {
//        return "SingleCopyExample{" +
//                "name='" + name + '\'' +
//                ", sirName='" + sirName + '\'' +
//                '}';
//    }

    public static void main(String[] args) {
        SingleCopyExample obj = new SingleCopyExample("nik","jonas","DYP","pune");
        SingleCopyExample obj1 = new SingleCopyExample("brok","sicon","DYP","pune");
        SingleCopyExample obj2 = new SingleCopyExample("hethr","Tesla","DYP","Pune");

        System.out.println(obj.toString());
        System.out.println(SingleCopyExample.collageName);
        System.out.println(SingleCopyExample.city);

        obj.dataStudent();
        obj1.dataStudent();
        obj2.dataStudent();





    }

}
