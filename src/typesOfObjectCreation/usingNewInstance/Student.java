package typesOfObjectCreation.usingNewInstance;

public class Student {

    private String name = "Nikhil";
    private String collage = "DYP";

    public Student (){
        super();
    }

    public Student(String name, String collage){
        super();
        this.name= name;
        this.collage=collage;
    }

    public String getName(){
        return name;
    }

    public void SetName(String name){
        this.name=name;
    }

    public String getcollege(){
        return collage;
    }

    public static void main(String[] args) {

    }

}
