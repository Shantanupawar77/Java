public class multable {
    static void mulTable(int m){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d =%d\n",m,i,i*m);
        }
    }    
    public static void main(String[] args) {
        
        mulTable(5);
    }
}
  