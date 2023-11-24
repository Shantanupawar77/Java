import java.util.Scanner;

public class string_method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String website=sc.next();
        if (website.endsWith(".org")){
            System.out.println("This an organisation website.");
        }
        else if (website.endsWith(".com")){
            System.out.println("This an Commercial website.");
        }
        else if (website.endsWith(".in")){
            System.out.println("This an Indian website.");
        }

    }
}
