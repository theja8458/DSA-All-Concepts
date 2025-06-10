class RowWithMaxOnes{
    static int lowerbount(int arr[],int x){
        int n = arr.length;
        int low = 0 , high = n-1;
        int ans = n;
        while (low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int mat[][]={{0,0,1,1,1},{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,0},{0,1,1,1,1}};
        int n = mat.length;
        int m = mat[0].length;
        int ind=-1;
        int max = -1;
        // for(int i=0 ; i<n ; i++){
        //     int countrow=0;
        //     for(int j=0 ; j<m ; j++){
        //         countrow += mat[i][j];
        //     }
        //     if(countrow > max){
        //         max = countrow;
        //         ind = i;
        //     }
        // }
        // System.out.println(ind);
        int cnMax = 0;
        int indx = -1;
        for(int i=0 ; i<n ; i++){
            int cnt = m - lowerbount(mat[i], 1);
            if(cnt > cnMax){
                cnMax =cnt;
                indx=i;
            }
        }
        // return indx;
        System.out.println(indx);
    }
}