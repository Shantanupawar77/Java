class rectangle{
    int length ;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return(2)*(length+breadth);
    }
}

public class practice_04_rectangle {
    public static void main(String[] args) {
        rectangle rec =new rectangle();
        rec.length=2;
        rec.breadth=3;
        System.out.print("The area of the reactangle is ");
        System.out.println(rec.area());
        System.out.print("The perimeter of the reactangle is ");
        System.out.println(rec.perimeter());
    }
}
