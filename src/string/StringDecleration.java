package string;

public class StringDecleration {

    //String literals objects
    String a = "Java";

    String x = "Program";
    String y = "Program";  // above all literal are store in SCP(String constant pool)in heap Area.



    // String new objects

    String s1 = new String("JemsGoslin"); // Create Two objects Because Object
    // is Store in heap area and literals are store in scp.


    // Character array into string

    char arr[] = {'J','A','V','a'};

   // String s = new String(arr);

    String s = new String(arr, 9,45);




    // How many objects are created in memory


    String t1 = new String("Java"); //Store with two objects are created one is heap memory and another is scp area
    String t2 = new String("Java"); //Different object but same literal, that case jvm will create new object in heap area.
                                            //and case of scp jvm will chek in scp check create same copy in scp then jvm point that same name.


   String s3 ="Java"; // point to the scp area same object literal
   String s4 ="Java";




















}
