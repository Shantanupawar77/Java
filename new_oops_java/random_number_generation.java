import java.util.Scanner;
import java.util.Random;
public class random_number_generation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.printf("Enter 0 for rock , 1 for paper ,2 for Scissor\n");
        int userInput=sc.nextInt();
        int computerInput=random.nextInt(3);

        if(userInput==computerInput){
            System.out.print("Draw");
        }
        else if((userInput==0 &&computerInput==2)|| (userInput==1 &&computerInput==0)||(userInput==2 &&computerInput==1) ){
            System.out.println("You win");
        }
        else{
            System.out.println("Computer win!");
        }
        
    }
}
