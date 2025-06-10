class BinarySearch{
    static int recBinarySrch(int arr[],int low,int hihgh,int target){
        if(low > hihgh) return -1;

        int mid = (low+hihgh)/2;
        if(arr[mid] == target) return mid;
        else if(target > arr[mid]) return recBinarySrch(arr, mid+1, hihgh, target);
        else return recBinarySrch(arr, low, mid-1, target);
    }
    public static void main(String[] args) {
        
    int arr[] = {3,4,6,7,9,12,16,17};
    int n = arr.length;
    int low = 0 , hihgh = n-1;
    while(low <= hihgh){
       int mid = (low+hihgh)/2;
       if(arr[mid] == 16) { 
        System.out.println(mid);
        break;
       }
       else if(arr[mid] < 16) low = mid+1;
       else  hihgh = mid-1;
    }
    System.out.println(recBinarySrch(arr,0,n-1,13));
}
}