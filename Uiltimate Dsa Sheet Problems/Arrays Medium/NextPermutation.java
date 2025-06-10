public class NextPermutation {
    static void reverse(int arr[],int left,int right){
        while(left < right){
           swap(arr,left,right);
            left++;
            right--;
        }
    }

    static void swap(int arr[],int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    
    public static void main(String[] args) {
    int arr[] = {3,2,1};
    int n = arr.length;
    int index = -1;
    for(int i=n-2 ; i>=0 ; i--){
        if(arr[i] < arr[i+1]){
            index = i;
            break;
        }
    }
    if(index == -1){
        reverse(arr,0,n-1);
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        return;
    }

    for(int i=n-1 ; i>=index ; i--){
        if(arr[i] > arr[index]){
           swap(arr, i, index);
            break;
        }
    }

    reverse(arr,index+1 , n-1);
    for(int i=0 ; i<n ; i++){
        System.out.print(arr[i]+" ");
    }
  }   
}
