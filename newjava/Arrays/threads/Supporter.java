package threads;
class Golu extends Thread{
    public void run(){
        while(true){
            System.out.println("My Thank you");
        }
    }
}
class Golu2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
}

public class Supporter {
    public static void main(String[] args) {
        Golu t1=new Golu();
        Golu2 t2=new Golu2();
        t1.start();
        t2.start();


    }
}
