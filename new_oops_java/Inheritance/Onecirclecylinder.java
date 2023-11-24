class Circle{
    public int radius;
    Circle(int r){
        this.radius=r;
    }
     
    public double area(){
        return 3.14*this.radius*this.radius;
      }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r,int h){
        super(r);
        this.height=h;

    }
   
    public double Volume(){
        return 3.14*this.radius*this.radius*this.height;
    }
}

public class Onecirclecylinder{
    public static void main(String[] args) {
        Cylinder obj=new Cylinder(4,7);
        //Circle obj=new Circle()
        System.out.println(obj.Volume());
    }
}
