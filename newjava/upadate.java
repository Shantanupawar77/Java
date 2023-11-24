import java.util.Scanner;
public class upadate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String update=sc.nextLine();

        String letter= "Dear <| name|>,Thanks a lot!";
        letter=letter.replace("name",update);
        System.out.println(letter);
    }
}
