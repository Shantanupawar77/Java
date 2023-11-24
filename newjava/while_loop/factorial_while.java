import java.util.Scanner;

public class factorial_while{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n :");
        int n=sc.nextInt();
        int factorial=1;
        int i=1;
        while(i<=n){
            factorial=factorial*i;
            i++;
        }
         
    System.out.printf("The factorial of %d is %d ",n,factorial);
    }
}
