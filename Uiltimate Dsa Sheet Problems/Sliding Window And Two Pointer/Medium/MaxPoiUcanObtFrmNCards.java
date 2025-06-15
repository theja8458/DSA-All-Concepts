public class MaxPoiUcanObtFrmNCards {
    public static void main(String[] args) {
        int arr[]= {6,2,3,4,7,2,1,7,1} , k = 4;
        int lsum = 0;
        int maxSum = 0;
        for(int i=0 ; i<k ; i++){
            lsum += arr[i];
        }
        maxSum = lsum;
        int n = arr.length;
        int rSum = 0;
        int rindex = n-1;
        for(int i=k-1 ; i>=0 ; i--){
         rSum -= arr[i];
         lsum += arr[rindex];
         maxSum = Math.max(maxSum, rSum+lsum);
         rindex--;
        }
        System.out.println("Answer : "+maxSum);
       

    }
}
