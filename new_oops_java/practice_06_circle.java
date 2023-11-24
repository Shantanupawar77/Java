class Circle{
    float radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float circumference(){
        return 2*3.14f*radius;
    }
}
public class practice_06_circle {
    public static void main(String[] args) {
        Circle cir=new Circle();
        cir.radius=3.00f;
        System.out.print("The area of the circle is ");
        System.out.println(cir.area());
        System.out.print("The circumference of the circle is ");
        System.out.println(cir.circumference());

    }
}
