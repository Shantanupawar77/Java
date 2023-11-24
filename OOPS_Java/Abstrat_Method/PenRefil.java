abstract class Pen{
    abstract void write();
    abstract void refil();

}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");

    }
    void refil(){
        System.out.println("Refil");
    }
    void changeNib(){
        System.out.println("Changing the nib ...");
    }
}
public class PenRefil {
    public static void main(String[] args) {
        FountainPen pen1=new FountainPen();
        pen1.changeNib();
    }
}
