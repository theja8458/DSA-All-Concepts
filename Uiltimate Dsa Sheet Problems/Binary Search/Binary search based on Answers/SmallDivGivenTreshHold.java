public class SmallDivGivenTreshHold {
    static int fun(int div , int arr[]){
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++){
          sum += Math.ceil((double)(arr[i]/div));
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[] = {1,2,5,9};
        int n = arr.length;
        int max = 0;
        int trshhold = 7;
        for(int i=0 ; i<n ; i++){
            max = Math.max(max,arr[i]);
        }
        // for(int d=1 ; d<=max ; d++){
        //     int sum = 0;
        //     for(int i=0 ; i<n ; i++){
        //         sum +=Math.ceil((double)arr[i]/d);
        //     }
        //     if(sum <= trshhold){
        //         System.out.println(d);
        //         return;
        //     }
        // } 

        int low = 1 , high = max;
        while (low <= high) {
             int mid = (low+high)/2;
             if(fun(mid , arr) <= trshhold){
                high = mid-1;
             }else{
                low = mid+1;
             }
        }
        System.out.println(low);
    }
}
