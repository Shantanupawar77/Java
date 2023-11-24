package Arrays;

public class average {
    public static void main(String[] args) {
        int  []abs={98,99,65,92,94};
        int  sum=0;
        for(int i=0;i<abs.length;i++){
            sum+=abs[i];
        }
        float avg=(float)sum/5.0f;
        System.out.print("The average of the arrays element is :");
        System.out.println(avg);
    }
    
}
