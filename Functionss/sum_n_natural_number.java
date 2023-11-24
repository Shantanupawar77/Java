public class sum_n_natural_number {
    static int recurs_Natuaral(int n){
     int sum=0;
     if(n==1){
         return 0;
     }
     else{
         return n + recurs_Natuaral(n-1);
     }
    }
    public static void main(String[] args) {
        System.out.println(recurs_Natuaral(3));
    }
}
