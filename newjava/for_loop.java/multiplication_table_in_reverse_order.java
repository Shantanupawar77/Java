import java.util.Scanner;

public class multiplication_table_in_reverse_order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n:");
        int n=sc.nextInt();
        for(int i=10;i>0;i--){
            System.out.printf("%d*%d=%d\n",n,i,(n*i));

        }

    }
}
