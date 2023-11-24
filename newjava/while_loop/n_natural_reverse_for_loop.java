import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class n_natural_reverse_for_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n:");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.println(i);
        }

    }
    
}
