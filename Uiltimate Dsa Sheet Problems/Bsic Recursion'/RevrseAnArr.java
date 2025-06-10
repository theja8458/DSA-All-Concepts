public class RevrseAnArr {
    static void fun(int arr[],int i,int n){
        if( i == n){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        fun(arr, i+1, n-1);
        
    }
    static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void rev(int arr[],int i){
        if(i > arr.length/2){
            return;
        }
        swap(arr,i,arr.length-i-1);
        rev(arr, i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        // fun(arr,0,arr.length-1);
        rev(arr, 0);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
