

public class prb_2 {
    public static void main(String[] args) {
        int  []abs={12,16,127,1245,134};
        
        int  n=124;
        boolean isInArray=false;
        for(int i=0;i<abs.length;i++){
            if(n==abs[i]){
                isInArray=true;
                break;
            }
            
        
        }
        if(isInArray){
            System.out.println("Given number is presnet in an Array");
        }
        else{
            System.out.println("Given number is not presnet in an Array");
        }
        
    }
}
