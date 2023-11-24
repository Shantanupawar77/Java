class Rectangle{
    public int length;
    public int breadth;

    public Rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public Rectangle(int length ,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
public class constructor_getter_setter {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle(45,98);
        System.out.println(rec.getBreadth());
        System.out.println(rec.getLength());
    }
}
