public class MedianInRowWiiseSrtMatr {
    static int upperBound(int arr[],int x){
        int n = arr.length;
        int ans = n;
        int low =0 , high = n-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] > x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
   static int countSmallerEqual(int mat[][],int n,int m,int x){
    int count=0;
    for(int i=0 ; i<n ; i++){
        count +=upperBound(mat[i] , x);
    }
    return count;
   }
    public static void main(String[] args) {
        int mat[][] = {{1,5,7,9,11} , {2,3,4,5,10} , {9,10,12,16}};
        int n = mat.length;
        int m = mat[0].length;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            low = Math.min(low , mat[i][0]);
            high = Math.max(high , mat[i][m-1]);
        }
        int req = (n*m)/2;
        while (low <= high) {
            int mid = (low+high)/2;
            int smallEqual = countSmallerEqual(mat , n,m,mid);
            if(smallEqual <= req){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(low);
    }
}
