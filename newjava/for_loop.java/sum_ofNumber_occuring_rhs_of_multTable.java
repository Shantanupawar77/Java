import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class sum_ofNumber_occuring_rhs_of_multTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+(n*i);

        }
        System.out.println(sum);
    }
    

}
