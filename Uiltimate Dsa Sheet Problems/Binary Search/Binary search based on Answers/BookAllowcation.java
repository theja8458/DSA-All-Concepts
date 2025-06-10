class BookAllowcation{
    static int fun(int pages , int arr[]){
        int students = 1 , pagesStudent = 0;
        for(int i=0 ; i<arr.length ; i++){
              if(pagesStudent+arr[i] <= pages ){
                pagesStudent += arr[i];
              }else{
                students++;
                pagesStudent = arr[i];
              }
        }
        return students;
    }
    public static void main(String[] args) {
        int arr[]= {25 , 46 , 28 , 49 , 24};
        int n = arr.length;
        int max = 0;
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            max = Math.max(arr[i] , max);
            sum += arr[i];
        }
        int students = 4;
        // for(int i=max ; i<= sum ; i++){
        //   if(fun(i , arr) == students){
        //     System.out.println(i);
        //     return;
        //   }
        // }
        int low = max , high = sum;
        while (low <= high) {
            int mid = (low+high)/2;
            int NofStud = fun(mid, arr);
            if(NofStud <= students){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        System.out.println(low);

        
    }
}