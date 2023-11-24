import java.util.Scanner;

public class first_n_odd_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.println(2 * i + 1);

        }
    }
}
