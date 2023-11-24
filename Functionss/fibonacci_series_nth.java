
public class fibonacci_series_nth {
    static int fib(int n){
    if(n==1 || n==2){
          return n-1;
      }
      
    else{
        return fib(n-1)+fib(n-2);
    }
    }
    public static void main(String[] args) {
      
        int result=fib(6);
        System.out.println(result);
    }
}
