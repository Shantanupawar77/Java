import java.util.Scanner;
public class pecentage {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks for Math:");
        float math=sc.nextFloat();
        System.out.println("Enter the marks for English:");
        float English=sc.nextFloat();
        System.out.println("Enter the marks for Physics:");
        float Physics=sc.nextFloat();
        System.out.println("Enter the marks for Biology:");
        float Biology=sc.nextFloat();
        System.out.println("Enter the marks for Chemistry:");
        float Chemistry=sc.nextFloat();
        float Total= math+English+Physics+Biology+Chemistry;
        float perc=(float)(Total/500)*100;
        System.out.println("Your percentage is ");
        System.out.println(perc);

    }
}
