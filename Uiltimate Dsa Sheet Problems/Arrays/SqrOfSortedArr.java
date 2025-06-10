public class SqrOfSortedArr {
    
    public static void solve(int arr[],int res[]){
        int left = 0 , right = arr.length-1;
        int idx = arr.length-1;

          while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if(leftSquare > rightSquare){
                res[idx] = leftSquare;
                left++;
            }else{
                res[idx] = rightSquare;
                right--;
            }
            idx--;
          }
    }
    public static void main(String args[]){
        int arr[] = {-4,-1,0,3,10};
        int res[] = new int[arr.length];
        solve(arr,res);
        for(int i=0 ; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
