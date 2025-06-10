public class SearchInTwoDMatrixTwo {
    public static void main(String[] args) {
        int mat[][] = {{1,4,7,11,15} , {2,5,8,12,19} , {3,6,9,16,22} , {10,13,14,17,24} , {18,21,23,26,30}};
        int row = 0 , col = mat[0].length-1;
        int targtet = 14;
        while (row < mat.length && col>=0) {
            if(mat[row][col] == targtet){
                System.out.println("True");
                return;
            }else if(mat[row][col] < targtet){
                row++;
            }else{
                col--;
            }
        }
        System.out.println("False");
    }
}
