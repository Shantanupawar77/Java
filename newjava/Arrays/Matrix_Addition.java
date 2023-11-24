

public class Matrix_Addition {
    public static void main(String[] args) {
        int [][]matrix1={{1,2,3},
                         {2,9,10}

        };
        int [][]matrix2={{3,6,91},
                         {20,17,10}

        };
        int [][]result={{0,0,0},
                        {0,0,0}

        };
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                System.out.printf("Setting value for i=%d and j=%d\n",i,j);
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                System.out.print(result[i][j]+" ");
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                }
                System.out.println(" ");
            
        }
    }
}
