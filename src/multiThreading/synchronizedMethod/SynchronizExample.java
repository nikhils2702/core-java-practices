package multiThreading.synchronizedMethod;


class Display{
    public synchronized void wish(String name){      //synchronized method
        for(int i = 0;i<10;i++){
            System.out.print("good morning : ");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){

            }
            System.out.println(name);
        }
    }
}

class Thread1 extends Thread{
    Display d;
    String name;

    Thread1(Display d,String name){
         this.d=d;
         this.name=name;
    }

    public void run(){
        d.wish(name);
    }
}

public class SynchronizExample {

    public static void main(String[] args) {
        Display obj = new Display();

        Thread1 t1 = new Thread1(obj,"Rohit");
        Thread1 t2 = new Thread1(obj,"Surya");

        t1.start();
        t2.start();
    }
}
