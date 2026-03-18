package ObjectClass.CloneMethod.copy.ShalloCopy;

class Details {

    String comp;
    int EmpId ;

    Details(String comp, int EmpId ){
        this.comp =comp;
        this.EmpId = EmpId;
    }

    public String toString(){
        return "Name of company" + comp + "Employee Id" + EmpId ;
    }
}


class Company implements Cloneable {

    String comp;
    int EmpId;
    Details Details;

    Company(String company, int EmpId, Details Details) {
        this.comp = company;
        this.EmpId = EmpId;
        this.Details = Details;

    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "Name of company" + comp + "change company" + Details;
    }
}

    public class ShallowCopyExample {
        public static void main(String[] args) {

            Details obj = new Details("TCS", 203);
            Details obj1 = obj;
            obj.EmpId = 101;
            obj1.EmpId = 102;

            obj.comp = "Tcs";
            obj1.comp = "MNC";


            System.out.println(obj.EmpId);
            System.out.println(obj1.EmpId);

            System.out.println(obj1.comp);
            System.out.print(obj.comp);

        }
    }


