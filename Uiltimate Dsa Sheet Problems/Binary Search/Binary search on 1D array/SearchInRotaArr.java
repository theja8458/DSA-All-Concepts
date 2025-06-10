public class SearchInRotaArr {
    public static void main(String[] args) {
        int arr[] = {7,8,9,1,2,3,4,5,6};
        int n = arr.length;
        int targtet = 1;
        int low = 0 , high = n-1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == targtet){ 
             System.out.println(mid);
             return;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] <= targtet && targtet <= arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid] <= targtet && targtet <= arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        //for duplicates 
        // if(arr[low] == arr[mid] && arr[mid] == arr[high]){
        //     low++;
        //     high--;
        //     continue;
        // }
    }
}
