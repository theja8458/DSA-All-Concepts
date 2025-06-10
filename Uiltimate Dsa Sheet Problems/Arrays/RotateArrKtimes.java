public class RotateArrKtimes {
    public static void sort(int arr[],int i,int k){
        // int i=0;
       while(i < k){
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
        i++;
        k--;
       }
    }
    public static void main(String args[]){
        int arr[] = {-1,-100,3,99};
        int k = 2;
        sort(arr,0,k);
        sort(arr,k+1,arr.length-1);
        sort(arr,0,arr.length-1);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
