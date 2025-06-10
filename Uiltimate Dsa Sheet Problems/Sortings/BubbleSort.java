public class BubbleSort {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        
        for(int i=n-1 ; i>=1 ; i--){
            int didSwap = 0;
            for(int j=0 ; j<=i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0) break;
            System.out.println("runs");
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
