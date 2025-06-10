public class NumberinTwoDArray {

      public static int Numberinarray(int matrix[][],int num){
        int count=0;
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(matrix[i][j]==num){
                count++;
                }
            }
        }
        return count;
      }
 
    public static void main(String args[]){
        int matrix[][]={{4,7,8},
                        {8,8,7}};
        int num=7;
        System.out.println(Numberinarray(matrix, num));
    }
    
}
