

public class Maximum_NUMBERS_IN_ARRAY {
    public static void main(String[] args) {
        int []arr={34,67,89,78,56,100};
        int max=Integer.MIN_VALUE;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("The maximum number in array is "+max);
    }
}
