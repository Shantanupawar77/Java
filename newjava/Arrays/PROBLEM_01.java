

public class PROBLEM_01 {
    public static void main(String[] args) {
        float []abs={1.2f,1.4f,1.6f,1.7f,1.9f};
        float sum=0;
        for(int i=0;i<abs.length;i++){
            sum+=abs[i];
        }
        System.out.print("The sum of the arrays element is :");
        System.out.println(sum);
    }
}
