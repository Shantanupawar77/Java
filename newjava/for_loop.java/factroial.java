import java.util.Scanner;

public class factroial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n :");
        int n=sc.nextInt();
        int factorial=1;
        
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.printf("The factorial of %d is %d ",n,factorial);
    }
}
