public class KadensAlgo {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int ansStart = -1;
        int ansEnd = -1;
        int start = -1;
        for(int i=0 ; i<arr.length ; i++){
            if(sum == 0){
                 start = i;
            }
            sum+= arr[i];
           if(sum > max){
            max = sum;
            ansStart =start;
            ansEnd = i;
           }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println("Maximum Sub array : "+max);
        System.out.println("the Subarray starts from : "+ansStart+" end at : "+ansEnd);
    }
}
