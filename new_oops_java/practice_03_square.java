class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class practice_03_square {
    public static void main(String[] args) {
        square sq=new square();
        sq.side=5;
        System.out.print("The area of the square is ");
        System.out.println(sq.area());
        System.out.print("The perimeter of the square is ");
        System.out.println(sq.perimeter());
    }
}
