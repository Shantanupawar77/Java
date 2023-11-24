class Cylinder{
   private float height;
   private float radius;

   public void setHeight(float h){
         height=h;
   }
   public float getHeight(){
       return height;
   }
   public void setRadius(float r){
    radius=r;
}
public float getRadius(){
    return radius;
}
public float volume(){
    return 3.14f*radius*radius*height;
}
public float totalSurfaceArea(){
    return (2*3.14f*radius*height)+(2*3.14f*radius*radius);
}

}
public class getter_and_setter {
    public static void main(String[] args) {
        Cylinder myCylinder=new Cylinder();
        myCylinder.setHeight(12);
        
        System.out.print("The height of the cylinder is ");
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(23);
        System.out.print("The radius of the cylinder is ");
        System.out.println(myCylinder.getRadius());
        System.out.print("The volume of the cylinder is ");
        System.out.println(myCylinder.volume());
        System.out.print("The TotalSurfaceArea of the cylinder is ");
        System.out.println(myCylinder.totalSurfaceArea());

       
     }
}
