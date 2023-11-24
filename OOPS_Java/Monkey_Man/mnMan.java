class Monkey1{
    void jump(){
        System.out.println(" ooh Jumping ...");

    }
    void bite(){
        System.out.println("Biting .");

    }
interface BasicAnimal1{
    void eat();
    void sleep();
}
class Human1 extends Monkey1 implements BasicAnimal1{
    void speak(){
        System.out.println("Hello sirji..");
    }
    @Override
    public void eat(){
        System.out.println("Wahhh Eating");
    }
    @Override
    public void sleep(){
        System.out.println("gurhh  sleeping ");
    }
}

}
public class mnMan {
    public static void main(String[] args) {
        Human1 harry=new Human1();
        harry.sleep();
    }
}
