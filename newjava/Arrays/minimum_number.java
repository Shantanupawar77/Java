

public class minimum_number {
    public static void main(String[] args) {
        int []arr={34,67,89,78,56,100};
        int min=Integer.MAX_VALUE;
        for(int e:arr){
            if(e<min){
                min=e;
            }
        }
        System.out.println("The minimum number in array is "+min);
        
    
    }
}
