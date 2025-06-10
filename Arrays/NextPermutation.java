public class NextPermutation {
    private  static void swap(int arr[],int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
  private static void reverse(int arr[],int start,int end){
       while(start < end){
        swap(arr, start, end);
        start++;
        end--;
       }
  }

  
   public static void permutation(int arr[]){
    int n=arr.length;
    int ind=-1;
    for(int i=n-2 ; i>=0 ; i--){
        if(arr[i] < arr[i+1]){
            ind = i;
            break;
        }
    }
    if(ind == -1){
        reverse(arr,0,n-1);
       return;
    }

    for(int i=n-2 ; i>ind ; i--){
        if(arr[i]>arr[ind]){
            swap(arr, ind, i);
            break;
        }
    }

    reverse(arr, ind+1, n-1);
   }

   public static void printarr(int arr[]){
    for(int i=0 ; i<arr.length ; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
   }
   

    public static void main(String args[]){
        int arr[]={2,1,5,4,3,0,0};
        permutation(arr);
        printarr(arr);
    }
}
