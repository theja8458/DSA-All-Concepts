public class RotateMatByNintyDeg {
    static void reverse(int mat[][],int i,int n){
       int left = 0 , right = n-1;
       while (left < right) {
           int temp = mat[i][left];
           mat[i][left] = mat[i][right];
           mat[i][right] = temp;
           left++;
           right--;
       }
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // int ans[][] = new int[mat.length][mat[0].length];
        // for(int i=0 ; i<mat.length ; i++){
        //     for(int j=0 ; j<mat[0].length ; j++){
        //         ans[j][mat.length-1-i] = mat[i][j];
        //     }
        // }
        // for(int i=0 ; i<ans.length ; i++){
        //     for(int j=0 ; j<ans.length ; j++){
        //         System.out.print(ans[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=0 ; i<mat.length-1 ; i++){
            for(int j=i+1 ; j<mat.length ; j++){
                 
                int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
            }
        }
        for(int i=0 ; i<mat.length ; i++){
            reverse(mat,i,mat.length);
        }
        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat.length ; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
