public class SetMatrixZeros {
    static void markRow(int i,int mat[][]){
        for(int j=0 ; j<mat.length ; j++){
            if(mat[i][j] != 0){
                mat[i][j] = -1;
            }
        }
    }
    static void markCol(int j,int  mat[][]){
        for(int i=0 ; i<mat.length ; i++){
            if(mat[i][j] != 0){
                mat[i][j] = -1;
            }
        }
    }
    public static void main(String args[]){
        int mat[][] = {{1,1,1,1},
                       {1,0,0,1},
                       {1,1,0,1},
                       {1,1,1,1}};
    

    // for(int i=0 ; i<mat.length ; i++){
    //     for(int j=0 ; j<mat[0].length ; j++){
    //         if(mat[i][j] == 0){
    //             markRow(i,mat);
    //             markCol(j,mat);
    //         }
    //     }
    // }
    // for(int i=0 ; i<mat.length ; i++){
    //     for(int j=0 ; j<mat[0].length ; j++){
    //        if(mat[i][j] == -1){
    //         mat[i][j] = 0;
    //        }
    //        System.out.print(mat[i][j]+" ");
    //     }
    //     System.out.println();
    // }

    // int row[] = new int[mat.length];
    // int col[] = new int[mat[0].length];
    // for(int i=0 ; i<mat.length ; i++){
    //     for(int j=0 ; j<mat[0].length ; j++){
    //         if(mat[i][j] == 0){
    //             row[i] = 1;
    //             col[j] = 1;
    //         }
    //     }
    // }
    // for(int i=0 ; i<mat.length ; i++){
    //     for(int j=0 ; j<mat[0].length ; j++){
    //         if(row[i] == 1 || col[j] == 1){
    //            mat[i][j] = 0;
    //         }
    //         System.out.print(mat[i][j]+" ");
    //     }
    //     System.out.println();
    // }
 
    // optimal approach
    int col0 = 1;
    for(int i=0 ; i<mat.length ; i++){
        for(int j=0 ; j<mat.length ; j++){
            if(mat[i][j] == 0){
                mat[i][0] = 0;
                if(j != 0)
                mat[0][j] = 0;
                else
                col0 =1; 
            }
        }
    }

    for(int i=1 ; i<mat.length ; i++){
        for(int j=1 ; j<mat.length ; j++){
            if(mat[i][j] != -1){
                if(mat[i][0] == 0 || mat[0][j] == 0){
                    mat[i][j] = 0;
                }
            }
        }
    }
    if(mat[0][0] == 0){
        for(int j=0 ; j<mat.length ; j++){
            mat[0][j] = 0;
        }
    }
    if(col0 == 0){
        for(int i=1 ; i<mat.length ; i++) mat[i][0] = 0;
    }
    for(int i=0 ; i<mat.length ; i++){
        for(int j=0 ; j<mat.length ; j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
}
}