public class SrchKeyInSortArray {
    
    public static boolean searckkey(int matrix[][], int key){
        // int row=0,col=matrix[0].length-1;

    //     while(row<matrix.length && col>=0){
    //         if(matrix[row][col] == key){
    //             System.out.println("key value found at (" +row+ "," +col+")");
    //             return true;
    //         }
    //         else if(key < matrix[row][col]){        //int matrix[][]={{10,20,30,40},
    //             col--;                                              //{15,25,35,45}
    //         }                                                       //{27,29,37,48},
    //         else{                                                   //{32,33,38,50}};
    //             row++;
    //         // }                                                  int key=33;
    //     }
    //     System.out.println("Key value not found");
    //     return false;
    // }
        int row=matrix.length-1, col=0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==key){
                return true;
            }
            else if(key < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }


    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,38,50}};
        int key=30;
     System.out.println(searckkey(matrix,key));
    }
}
