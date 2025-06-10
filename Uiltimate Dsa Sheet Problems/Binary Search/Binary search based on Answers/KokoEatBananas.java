public class KokoEatBananas {
    static int fun(int arr[],int hour){
        int totalTime=0;
        for(int i=0 ; i<arr.length ; i++){
         double ceil = Math.ceil((double)arr[i]/hour);
         totalTime += ceil;
        }
        return totalTime;
    }
    public static void main(String[] args) {
        int arr[] = {3,6,7,11};
        int h=8;
        int max = 0;
        for(int i=0 ; i<arr.length ; i++){
            max = Math.max(arr[i],max);
        }
        for(int i=1 ; i<=max ; i++){
            int reqTime = fun(arr,i);
            if(reqTime <= h){
                System.out.println(i);
                return;
            }
        }

        int low = 1 , high = max;
        while (low <= high) {
            int mid = (low+high)/2;
            int totalhrs = fun(arr, mid) ;
            if(totalhrs <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(low);
    }
}
