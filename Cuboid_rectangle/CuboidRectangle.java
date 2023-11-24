class Rectangle{
    public int length;
    public int breadth;
    Rectangle(int l,int b){
         this.length=l;
         this.breadth=b;
    }
    public double area(){
        return length*breadth;
    }
    

}
class Cuboid extends Rectangle{
    public int height;
    Cuboid(int l,int b,int h){
       super(l,b);
       this.height=h;
    }
    public double area(){
        return (2*length*height)+(2*length*breadth)+(2*height*breadth);
    }
    public double volume(){
        return length*breadth*height;
    }
// sa=2lh+2lb+2hb
}
public class CuboidRectangle {
    public static void main(String[] args) {
        Cuboid sd= new Cuboid(2,5,8);
        System.out.println(sd.area());
        System.out.println(sd.volume());
    }
}
