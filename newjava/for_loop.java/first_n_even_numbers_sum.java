
import java.util.Scanner;
public class first_n_even_numbers_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many number which you want to have that  first sum even nubers:");
        int n=sc.nextInt();
        System.out.println("How many number which you want to have that  first sum odd nubers:");
        int m=sc.nextInt();
        int sumeven=0;
        int sumodd=0;
        for(int i=0;i<n;i++){
            sumeven = sumeven +(2*i);
        }
         System.out.printf("The sum of first %d even numbers is ",n);
         System.out.println(sumeven);
         for(int j=0;j<m;j++){
            sumodd = sumodd +((2*j)+1);
        }
         System.out.printf("The sum of first %d odd numbers is ",m);
         System.out.println(sumodd);
    }
}
