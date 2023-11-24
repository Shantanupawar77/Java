public class Sorted_or_not {
    public static void main(String[] args) {
        boolean isSorted=true;
        int []arr={12,45,67,89,455,9};
        for(int i=0;i<(arr.length-1);i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is  sorted");
            
        }
        else{
            System.out.println("The array is not  sorted");

        }
    }
}
