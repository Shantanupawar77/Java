import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your marks in physics:");
        byte m1=sc.nextByte();
        System.out.println("Enter Your marks in chemistry:");
        byte m2=sc.nextByte();
        System.out.println("Enter Your marks in math:");
        byte m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage is "+ avg);
        if(avg>=40 && m1>33 && m2>33 && m3>33){
            System.out.println("Congratulations ,You have been promoted");
        }
        else{
            System.out.println("Sorry you have not been promoted");
        }

    }
}
