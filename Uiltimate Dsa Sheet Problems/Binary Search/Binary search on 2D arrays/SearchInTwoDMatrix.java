class SearchInTwoDMatrix{
    public static void main(String[] args) {
        int mat[][] = {{3,4,7,9} , {12,1,16,18} , {20,21,23,24}};
        int n = mat.length;
        int targtet = 23;
        int m = mat[0].length;
        int low = 0 , high = (m*n)-1;
        while (low <= high) {
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m;
            if(mat[row][col] == targtet){
                System.out.println("True");
                return;
            }else if(mat[row][col] < targtet) low = mid+1;
            else high = mid-1;
        }
      System.out.println("False");
    }
}