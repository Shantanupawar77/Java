import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value for radius:");
        int r =sc.nextInt();
        System.out.println("Enter the value for pii:");
        float pii =sc.nextFloat();
        float Area=pii*r*r;
        System.out.print("The area of the given circle");
        System.out.println(Area);


    }
}
