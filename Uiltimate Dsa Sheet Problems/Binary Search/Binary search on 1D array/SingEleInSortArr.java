public class SingEleInSortArr {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
        int n = arr.length;
        if(n == 1){
            System.out.println(arr[0]);
            return;
        }
        if(arr[0] != arr[1]){
            System.out.println(arr[0]);
            return;
        }
        if(arr[n-1] != arr[n-2]){
            System.out.println(arr[n-1]);
            return;
        }
        int low = 1, high = n-2;
        while (low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1] ){
                System.out.println(arr[mid]);
                return;
            }
            if((mid%2 == 1) && arr[mid-1]==arr[mid] || (mid%2==0) && arr[mid] == arr[mid+1]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    }
}
