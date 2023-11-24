

public class methods {
    public static void main(String[] args) {
        int []arr={23,87,99,88};
        System.out.println(arr.length);
        // despalying array in reverse order
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //in reverse order
        for(int j=(arr.length)-1;j>=0;j--){
            System.out.println(arr[j]);
        }
        //for each loop
        for(int element :arr){
            System.out.println(element);
        }
    }
}
