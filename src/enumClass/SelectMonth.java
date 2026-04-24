package enumClass;

enum Month{

    JAN,FEB,MAR,APR,MAY,JUN
}

public class SelectMonth {
    public static void main(String[] args) {
        Month obj = Month.FEB;

        switch (obj){

            case JAN:
                System.out.println("End of winter");
            break;
            case FEB:
                System.out.println("Start Summer ");
            break;
            case MAR:
                System.out.println("More Sun hot go swimming");
            break;
            case APR:
                System.out.println("enjoy in Waterpark");
            break;
            case MAY:
                System.out.println("Its School result time");
            break;
            case JUN:
                System.out.println("Start rain");
            break;

        }
    }
}
